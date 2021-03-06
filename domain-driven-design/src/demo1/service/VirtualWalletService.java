package demo1.service;

import common.enums.Status;
import common.exception.InsufficientBalanceException;
import common.exception.NoSufficientBalanceException;
import common.model.VirtualWalletEntity;
import common.model.VirtualWalletTransactionEntity;
import common.repository.VirtualWalletRepository;
import common.repository.VirtualWalletTransactionRepository;

import java.math.BigDecimal;

/**
 * @author zhoude
 * @date 2020/10/7 12:47
 */
public class VirtualWalletService {

    private VirtualWalletRepository walletRepo;
    private VirtualWalletTransactionRepository transactionRepo;

    /**
     * 获取虚拟钱包BO
     */
    public VirtualWalletBo getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWalletBo walletBo = convert(walletEntity);
        return walletBo;
    }

    /**
     * VirtualWalletEntity convert to VirtualWalletBo
     */
    private VirtualWalletBo convert(VirtualWalletEntity walletEntity) {
        // 伪实现
        return new VirtualWalletBo();
    }

    /**
     * 获取钱包余额
     */
    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    /**
     * 转账
     */
    public void debit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        if (balance.compareTo(amount) < 0) {
            throw new NoSufficientBalanceException("");
        }
        walletRepo.updateBalance(walletId, balance.subtract(amount));
    }

    public void credit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        walletRepo.updateBalance(walletId, balance.add(amount));
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setFromWalletId(fromWalletId);
        transactionEntity.setToWalletId(toWalletId);
        transactionEntity.setStatus(Status.TO_BE_EXECUTED);
        Long transactionId = transactionRepo.saveTransaction(transactionEntity);
        try {
            debit(fromWalletId, amount);
            credit(toWalletId, amount);
        }
        catch (InsufficientBalanceException e) {
            transactionRepo.updateStatus(transactionId, Status.CLOSED);
            // rethrow exception e
        }
        catch (Exception e) {
            transactionRepo.updateStatus(transactionId, Status.FAILED);
            // rethrow exception e
        }
        transactionRepo.updateStatus(transactionId, Status.EXECUTED);
    }

}
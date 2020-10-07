package demo2.service;

import common.enums.Status;
import common.exception.InsufficientBalanceException;
import common.model.VirtualWalletEntity;
import common.model.VirtualWalletTransactionEntity;
import common.repository.VirtualWalletRepository;
import common.repository.VirtualWalletTransactionRepository;
import demo1.service.VirtualWalletBo;

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
    public VirtualWalletDomain getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWalletDomain walletBo = convert(walletEntity);
        return walletBo;
    }

    /**
     * VirtualWalletDomain convert to VirtualWalletBo
     */
    private VirtualWalletDomain convert(VirtualWalletEntity walletEntity) {
        // 伪实现
        return new VirtualWalletDomain(walletEntity.getId());
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
        VirtualWalletDomain wallet = convert(walletEntity);
        wallet.debit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
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
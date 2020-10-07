package common.controller;

import demo1.service.VirtualWalletService;

import java.math.BigDecimal;

/**
 * @author zhoude
 * @date 2020/10/7 12:44
 */
public class VirtualWalletController {

    private VirtualWalletService virtualWalletService;

    /**
     * 查询余额
     *
     * @param walletId 钱包id
     * @return 此钱包可用额度
     */
    public BigDecimal getBalance(Long walletId) {
        return virtualWalletService.getBalance(walletId);
    }

    /**
     * 出账
     *
     * @param walletId 钱包id
     * @param amount   出账金额
     */
    public void debit(Long walletId, BigDecimal amount) {
        virtualWalletService.debit(walletId, amount);
    }

    /**
     * 入账
     *
     * @param walletId 钱包id
     * @param amount   入账金额
     */
    public void credit(Long walletId, BigDecimal amount) {
        virtualWalletService.credit(walletId, amount);
    }

    /**
     * 转账
     *
     * @param fromWalletId 出账钱包id
     * @param toWalletId   入账钱包id
     * @param amount       转账金额
     */
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        virtualWalletService.transfer(fromWalletId, toWalletId, amount);
    }

}
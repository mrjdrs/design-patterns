package common.repository;

import common.model.VirtualWalletEntity;

import java.math.BigDecimal;

/**
 * @author zhoude
 * @date 2020/10/7 12:48
 */
public class VirtualWalletRepository {

    /**
     * 根据钱包id获取虚拟钱包实体
     */
    public VirtualWalletEntity getWalletEntity(Long walletId) {
        // 伪实现
        return new VirtualWalletEntity();
    }

    /**
     * 获取钱包余额
     */
    public BigDecimal getBalance(Long walletId) {
        // 伪实现
        return new BigDecimal("100");
    }

    /**
     * 修改钱包余额
     */
    public void updateBalance(Long walletId, BigDecimal balance) {
        // 伪实现
    }

}
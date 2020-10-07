package demo2.service;

import common.exception.InsufficientBalanceException;
import common.exception.InvalidAmountException;

import java.math.BigDecimal;

/**
 * @author zhoude
 * @date 2020/10/7 13:16
 */
public class VirtualWalletPlusDomain {

    /**
     * 主键
     */
    private Long id;

    /**
     * 钱包创建时间
     */
    private Long createTime = System.currentTimeMillis();

    /**
     * 余额
     */
    private BigDecimal balance = BigDecimal.ZERO;

    /**
     * 是否允许透支；true=允许，false不允许
     */
    private boolean isAllowedOverdraft = true;

    /**
     * 透支额度
     */
    private BigDecimal overdraftAmount = BigDecimal.ZERO;

    /**
     * 冻结金额
     */
    private BigDecimal frozenAmount = BigDecimal.ZERO;

//  contractor

    public VirtualWalletPlusDomain(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

//  method

    public BigDecimal balance() {
        return this.balance;
    }

    /**
     * 可用余额 = 余额 - 冻结金额 + 透支额度
     */
    public BigDecimal getAvailableBalance() {
        BigDecimal totalAvaliableBalance = this.balance.subtract(this.frozenAmount);
        if (isAllowedOverdraft) {
            totalAvaliableBalance = totalAvaliableBalance.add(this.overdraftAmount);
        }
        return totalAvaliableBalance;
    }

    public void debit(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException("");
        }
        this.balance = this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("");
        }
        this.balance = this.balance.add(amount);
    }

    public void freeze(BigDecimal amount) {
        // ...
    }

    public void unfreeze(BigDecimal amount) {
        // ...
    }

    public void increaseOverdraftAmount(BigDecimal amount) {
        // ...
    }

    public void decreaseOverdraftAmount(BigDecimal amount) {
        // ...
    }

    public void closeOverdraft() {
        // ...
    }

    public void openOverdraft() {
        // ...
    }

}
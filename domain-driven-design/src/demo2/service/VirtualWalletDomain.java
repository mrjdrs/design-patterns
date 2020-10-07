package demo2.service;

import common.exception.InsufficientBalanceException;
import common.exception.InvalidAmountException;

import java.math.BigDecimal;

/**
 * @author zhoude
 * @date 2020/10/7 13:16
 */
public class VirtualWalletDomain {

    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;

//  contractor

    public VirtualWalletDomain(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

//  method

    public BigDecimal balance() {
        return this.balance;
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

}
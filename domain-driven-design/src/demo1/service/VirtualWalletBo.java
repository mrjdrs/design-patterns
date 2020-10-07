package demo1.service;

import java.math.BigDecimal;

/**
 * @author zhoude
 * @date 2020/10/7 12:47
 */
public class VirtualWalletBo {

    /**
     * 主键
     */
    private Long id;

    /**
     * 钱包创建金额
     */
    private Long createTime;

    /**
     * 钱包余额
     */
    private BigDecimal balance;

//  getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
package common.model;

import java.math.BigDecimal;

/**
 * 虚拟钱包实体
 *
 * @author zhoude
 * @date 2020/10/7 12:51
 */
public class VirtualWalletEntity {

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
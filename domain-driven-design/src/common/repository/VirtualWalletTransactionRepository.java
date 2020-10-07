package common.repository;

import common.enums.Status;
import common.model.VirtualWalletTransactionEntity;

/**
 * @author zhoude
 * @date 2020/10/7 12:48
 */
public class VirtualWalletTransactionRepository {

    public Long saveTransaction(VirtualWalletTransactionEntity transactionEntity) {
        // 伪实现
        return -1L;
    }

    public void updateStatus(Long walletId, Status status) {
        // 伪实现
    }

}
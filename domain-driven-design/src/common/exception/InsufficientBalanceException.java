package common.exception;

/**
 * @author zhoude
 * @date 2020/10/7 13:11
 */
public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);
    }

}
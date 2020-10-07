package common.exception;

/**
 * @author zhoude
 * @date 2020/10/7 13:02
 */
public class NoSufficientBalanceException extends RuntimeException {

    public NoSufficientBalanceException(String message) {
        super(message);
    }

}
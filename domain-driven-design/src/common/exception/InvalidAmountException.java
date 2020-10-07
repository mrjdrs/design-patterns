package common.exception;

/**
 * @author zhoude
 * @date 2020/10/7 13:11
 */
public class InvalidAmountException extends RuntimeException {

    public InvalidAmountException(String message) {
        super(message);
    }

}
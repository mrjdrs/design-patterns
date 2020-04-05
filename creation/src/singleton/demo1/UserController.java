package singleton.demo1;

import java.io.IOException;
import java.text.MessageFormat;

/**
 * @author zhoude
 * @date 2020/4/4 15:45
 */
public class UserController {

    private Logger log = new Logger();

    public UserController() throws IOException {
    }

    public void login(String username, String password) throws IOException {
        log.log(MessageFormat.format("login username={0} password={1}", username, password));
    }
}

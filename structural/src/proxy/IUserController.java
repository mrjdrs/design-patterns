package proxy;

/**
 * @author zhoude
 * @date 2020/4/7 21:33
 */
public interface IUserController {

    void login(String mobile, String password);

    void register(String mobile, String password);
}

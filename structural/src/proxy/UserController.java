package proxy;

/**
 * @author zhoude
 * @date 2020/4/7 21:22
 */
public class UserController implements IUserController {

    /**
     * 通过构造函数注入
     */
    private MetricsCollector metricsCollector;

    @Override
    public void login(String mobile, String password) {
        // 这里是登录的业务逻辑
    }

    @Override
    public void register(String mobile, String password) {
        // 这里是注册的业务逻辑
    }
}

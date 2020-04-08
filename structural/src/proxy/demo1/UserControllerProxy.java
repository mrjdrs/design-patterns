package proxy.demo1;

import proxy.IUserController;
import proxy.MetricsCollector;
import proxy.UserController;

/**
 * @author zhoude
 * @date 2020/4/7 21:33
 */
public class UserControllerProxy implements IUserController {

    private UserController userController;
    private MetricsCollector metricsCollector;

    public UserControllerProxy(UserController userController) {
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public void login(String mobile, String password) {
        long start = System.currentTimeMillis();
        userController.login(mobile, password);
        long end = System.currentTimeMillis();
        long resTime = end - start;
        metricsCollector.record("/login", resTime);
    }

    @Override
    public void register(String mobile, String password) {
        long start = System.currentTimeMillis();
        userController.register(mobile, password);
        long end = System.currentTimeMillis();
        long resTime = end - start;
        metricsCollector.record("/register", resTime);
    }
}

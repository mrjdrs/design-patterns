package proxy.demo2;

import proxy.IUserController;
import proxy.UserController;

/**
 * @author zhoude
 * @date 2020/4/7 21:58
 */
public class Test {

    public static void main(String[] args) {
        MetricsCollectorProxy metricsCollectorProxy = new MetricsCollectorProxy();
        IUserController proxy = (IUserController) metricsCollectorProxy.createProxy(new UserController());
    }
}

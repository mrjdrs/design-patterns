package proxy.demo1;

import proxy.IUserController;
import proxy.UserController;

/**
 * @author zhoude
 * @date 2020/4/7 21:37
 */
public class Test {

    public static void main(String[] args) {
        IUserController userController = new UserControllerProxy(new UserController());
    }
}

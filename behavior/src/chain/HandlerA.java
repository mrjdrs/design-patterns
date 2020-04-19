package chain;

/**
 * @author zhoude
 * @date 2020/4/19 18:04
 */
public class HandlerA extends Handler {
    @Override
    public boolean doHandler() {
        System.err.println("这里是HandlerA的处理逻辑");
        return false;
    }
}

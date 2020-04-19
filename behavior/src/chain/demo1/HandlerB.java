package chain.demo1;

/**
 * @author zhoude
 * @date 2020/4/19 18:04
 */
public class HandlerB extends Handler {
    @Override
    public boolean doHandler() {
        System.err.println("这里是HandlerB的处理逻辑");
        return false;
    }
}

package chain.demo2;

/**
 * @author zhoude
 * @date 2020/4/19 18:04
 */
public class HandlerB implements IHandler {
    @Override
    public boolean hanlder() {
        System.err.println("这里是HandlerB的处理逻辑");
        return false;
    }
}

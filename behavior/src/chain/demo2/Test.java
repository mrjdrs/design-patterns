package chain.demo2;

/**
 * @author zhoude
 * @date 2020/4/19 18:39
 */
public class Test {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handler();
    }
}

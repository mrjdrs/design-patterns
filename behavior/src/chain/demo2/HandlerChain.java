package chain.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoude
 * @date 2020/4/19 18:36
 */
public class HandlerChain {
    private List<IHandler> chain = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.chain.add(handler);
    }

    public void handler() {
        for (IHandler handler : chain) {
            boolean handled = handler.hanlder();
            if (handled) {
                break;
            }
        }
    }
}

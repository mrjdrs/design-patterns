package chain.demo1;

/**
 * 处理链路
 *
 * @author zhoude
 * @date 2020/4/19 18:09
 */
public class HandlerChain {
    /**
     * 头链路
     */
    private Handler head;

    /**
     * 尾链路
     */
    private Handler tail;

    public void addHandler(Handler handler) {
        // 每次添加新的处理链前先将尾链路的接班人设置为null，表示无后续链路
        handler.setSuccessor(null);

        // 第一个链路的头尾链路是同一个
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }

        // 非第一个链路，先设置其接班人为当前新添加的链路
        tail.setSuccessor(handler);
        // 新添加一个链路后，此条链路的尾部链路为当前添加的链路
        tail = handler;
    }

    public void handler() {
        if (head != null) {
            head.handle();
        }
    }
}

package chain;

/**
 * 职责连-抽象类
 *
 * @author zhoude
 * @date 2020/4/19 18:02
 */
public abstract class Handler {
    /**
     * 链路的接班人，也就是下一个要处理的链路，如果为null则表示这是最后一个链路
     */
    protected Handler successor = null;

    public final void handle() {
        boolean handler = doHandler();
        // 如果此链路未处理完成则转交到下一个链路处理
        if (!handler && successor != null) {
            successor.handle();
        }
    }

    /**
     * 当前链路的处理逻辑
     *
     * @return true=处理成功，false=未处理完成，待后续链路处理
     */
    public abstract boolean doHandler();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}

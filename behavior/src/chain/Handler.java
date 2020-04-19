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

    /**
     * 当前链路的处理逻辑
     */
    public abstract void handle();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}

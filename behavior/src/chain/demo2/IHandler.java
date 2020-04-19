package chain.demo2;

/**
 * 处理链
 *
 * @author zhoude
 * @date 2020/4/19 18:35
 */
public interface IHandler {
    /**
     * 具体处理逻辑
     *
     * @return true=处理成功，false=未处理完成，待后续链路处理
     */
    boolean handler();
}

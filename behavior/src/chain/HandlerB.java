package chain;

/**
 * @author zhoude
 * @date 2020/4/19 18:04
 */
public class HandlerB extends Handler {
    @Override
    public void handle() {
        // 处理结果；true=处理完成，无需后续链路处理；false=未处理完成，需要后续链路处理
        boolean handled = false;
        System.err.println("这里是HandlerB的处理逻辑");
        // 如果此链路未处理完成则转交到下一个链路处理
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}

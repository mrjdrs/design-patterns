package observer.demo1;

/**
 * 被观察者
 *
 * @author zhoude
 * @date 2020/4/12 14:48
 */
public interface Observer {

    /**
     * 接受观察者的通知消息
     *
     * @param message 通知消息
     */
    void notify(String message);
}

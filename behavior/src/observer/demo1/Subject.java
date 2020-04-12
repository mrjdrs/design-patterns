package observer.demo1;

/**
 * @author zhoude
 * @date 2020/4/12 14:49
 */
public interface Subject {

    /**
     * 添加一个被观察者
     *
     * @param observer 被观察者
     */
    void addObserver(Observer observer);

    /**
     * 移除一个被观察者
     *
     * @param observer 被观察者
     */
    void removeObserver(Observer observer);

    /**
     * 给被观察者发送消息
     *
     * @param message 通知消息
     */
    void notifyObservers(String message);
}

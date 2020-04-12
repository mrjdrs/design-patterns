package observer.demo1.impl;

import observer.demo1.Observer;

/**
 * @author zhoude
 * @date 2020/4/12 14:54
 */
public class ObserverImpl2 implements Observer {

    @Override
    public void notify(String message) {
        System.err.println("observer2 message:" + message);
    }
}

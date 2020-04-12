package observer.demo1;

import observer.demo1.impl.ObserverImpl1;
import observer.demo1.impl.ObserverImpl2;
import observer.demo1.impl.SubjectImpl;

/**
 * @author zhoude
 * @date 2020/4/12 14:55
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        subject.addObserver(new ObserverImpl1());
        subject.addObserver(new ObserverImpl2());
        subject.notifyObservers("msg");
    }
}

package observer.demo1.impl;

import observer.demo1.Observer;
import observer.demo1.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoude
 * @date 2020/4/12 14:52
 */
public class SubjectImpl implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notify(message);
        }
    }
}

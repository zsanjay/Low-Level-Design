package org.sanjay.lld.design.patterns.behavioral.observer;

import org.sanjay.lld.design.patterns.behavioral.observer.observable.IphoneStockObservableImpl;
import org.sanjay.lld.design.patterns.behavioral.observer.observable.StocksObservable;
import org.sanjay.lld.design.patterns.behavioral.observer.observer.EmailAlertObserver;
import org.sanjay.lld.design.patterns.behavioral.observer.observer.MobileAlertObserver;
import org.sanjay.lld.design.patterns.behavioral.observer.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StocksObservable observable = new IphoneStockObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserver("sanjay@gmail.com" , observable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("rohit@gmail.com" , observable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("+91 9958806397" , observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);
        observable.setStockCount(0);
        observable.setStockCount(100);
    }
}

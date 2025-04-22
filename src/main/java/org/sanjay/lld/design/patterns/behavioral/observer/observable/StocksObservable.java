package org.sanjay.lld.design.patterns.behavioral.observer.observable;

import org.sanjay.lld.design.patterns.behavioral.observer.observer.NotificationAlertObserver;

public interface StocksObservable {

     void add(NotificationAlertObserver observer);
     void remove(NotificationAlertObserver observer);
     void setStockCount(int newStock);
     int getStockCount();
}

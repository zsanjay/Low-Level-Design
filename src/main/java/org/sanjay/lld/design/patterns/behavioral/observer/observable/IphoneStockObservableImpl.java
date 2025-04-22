package org.sanjay.lld.design.patterns.behavioral.observer.observable;

import org.sanjay.lld.design.patterns.behavioral.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StocksObservable {

    List<NotificationAlertObserver> list = new ArrayList<>();
    int currentStock = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        list.remove(observer);
    }

    private void notifySubscribers() {
        for(NotificationAlertObserver observer : list) {
            observer.sendNotification();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(currentStock == 0 && newStock > 0) {
            currentStock = newStock;
            notifySubscribers();
        }
        currentStock = newStock;
    }

    @Override
    public int getStockCount() {
        return currentStock;
    }
}

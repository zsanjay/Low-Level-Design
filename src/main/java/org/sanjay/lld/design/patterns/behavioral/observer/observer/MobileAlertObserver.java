package org.sanjay.lld.design.patterns.behavioral.observer.observer;

import org.sanjay.lld.design.patterns.behavioral.observer.observable.StocksObservable;

public class MobileAlertObserver implements  NotificationAlertObserver {

    private StocksObservable stocksObservable;
    private String number;

    public MobileAlertObserver(String number, StocksObservable stocksObservable) {
        this.number = number;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending mobile notification on " + this.number +"  for the updated stock = " + stocksObservable.getStockCount());
    }
}

package org.sanjay.lld.design.patterns.behavioral.observer.observer;

import org.sanjay.lld.design.patterns.behavioral.observer.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    private StocksObservable stocksObservable;
    private String email;

    public EmailAlertObserver(String email, StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending email alert to " + this.email+" for the updated stock = " + this.stocksObservable.getStockCount());
    }
}

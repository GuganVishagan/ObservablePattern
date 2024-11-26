package org.observablePattern.Observer;

import org.observablePattern.Observable.StockObservable;

public class PhoneAlertObserver implements NotificationObserver {

    StockObservable stockObservable;
    String userName;
    public PhoneAlertObserver(StockObservable stockObservable, String userName) {
        this.stockObservable = stockObservable;
        this.userName = userName;
    }
    @Override
    public void update() {
      sendMessageOnMobile(userName, "Product ready!");
    }

    public void sendMessageOnMobile(String userName, String message) {
        System.out.println("Sending email to " + userName);
    }
}

package org.observablePattern.Observer;

import org.observablePattern.Observable.StockObservable;


public class EmailAlertObserver implements NotificationObserver {

    StockObservable observable;
    String emailId;

    public EmailAlertObserver(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(emailId, "product is ready!");
    }

    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email);
    }
}

package org.observablePattern;

import org.observablePattern.Observable.AndroidObservable;
import org.observablePattern.Observable.IphoneObservable;
import org.observablePattern.Observable.StockObservable;
import org.observablePattern.Observer.EmailAlertObserver;
import org.observablePattern.Observer.NotificationObserver;
import org.observablePattern.Observer.PhoneAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable androidObservable = new AndroidObservable();
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationObserver observer1 = new EmailAlertObserver(iphoneObservable, "vishal@gmail.com");
        NotificationObserver observer2 = new EmailAlertObserver(iphoneObservable, "Rohan@gmail.com");
        NotificationObserver notificationObserver2 = new PhoneAlertObserver(androidObservable, "Vishal");

        iphoneObservable.addObserver(observer1);
        iphoneObservable.addObserver(observer2);
        androidObservable.addObserver(notificationObserver2);

        iphoneObservable.setStockCount(10);

    }
}
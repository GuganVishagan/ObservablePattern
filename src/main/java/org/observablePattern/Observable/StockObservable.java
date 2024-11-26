package org.observablePattern.Observable;

import org.observablePattern.Observer.NotificationObserver;

import java.util.Observer;

public interface StockObservable {

    public void addObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void setStockCount(int newStockAdded);
    public int getStockCount();
    public void notifyObservers();
}

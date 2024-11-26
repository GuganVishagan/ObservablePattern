package org.observablePattern.Observable;

import org.observablePattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservable implements StockObservable{
    public List<NotificationObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addObserver(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observerList.remove(observerList);
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifyObservers();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }
}

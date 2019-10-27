package com.upperapps.weatherobservablebasics.domain;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {

    List<IObserver> observers = new ArrayList<IObserver>();

    default void addObserver(IObserver observer) {
        this.observers.add(observer);
    };

    default void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    };

    default void notifyObservers() {
        this.observers.forEach(observer -> observer.update());
    };
}
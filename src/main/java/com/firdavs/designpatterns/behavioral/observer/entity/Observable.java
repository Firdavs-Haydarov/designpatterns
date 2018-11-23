package com.firdavs.designpatterns.behavioral.observer.entity;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}

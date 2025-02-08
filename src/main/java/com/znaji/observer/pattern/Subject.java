package com.znaji.observer.pattern;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);

    void notifyObservers();
}

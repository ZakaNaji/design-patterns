package com.znaji.observer.pattern.store;

public interface Subject {
    void subscribe(Customer customer);
    void unsubscribe(Customer customer);
    void notifyNewProduct(String type, String name);
}
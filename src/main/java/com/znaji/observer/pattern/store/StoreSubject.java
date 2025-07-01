package com.znaji.observer.pattern.store;

import java.util.ArrayList;
import java.util.List;

public class StoreSubject implements Subject {

    private final List<Customer> customers = new ArrayList<>();

    @Override
    public void subscribe(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    @Override
    public void unsubscribe(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyNewProduct(String type, String name) {
        Message message = new Message(type, name);
        customers.forEach(customer -> customer.update(message));
    }
}

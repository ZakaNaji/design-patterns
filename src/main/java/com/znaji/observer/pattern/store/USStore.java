package com.znaji.observer.pattern.store;

public class USStore implements Customer {
    @Override
    public void update(Message message) {
        if (message.getType().equals("NEW_PRODUCT")) {
            System.out.printf("[%s]: New product %s is now available in our US store!\n", 
                this.getClass().getSimpleName(), message.getName());
        }
    }
}
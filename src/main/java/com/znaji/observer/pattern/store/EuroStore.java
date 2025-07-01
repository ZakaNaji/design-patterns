package com.znaji.observer.pattern.store;

public class EuroStore implements Customer{
    @Override
    public void update(Message message) {
        if (message.getType().equals("NEW_PRODUCT")) {
            System.out.printf("[%s]: new Product %s just droped, need to update site\n",this.getClass().getSimpleName() ,message.getName());
        }
    }
}

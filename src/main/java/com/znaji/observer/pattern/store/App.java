package com.znaji.observer.pattern.store;

public class App {
    public static void main(String[] args) {
        // Create the subject
        Subject subject = new StoreSubject();

        // Create observers
        Customer euroStore = new EuroStore();
        Customer usStore = new USStore();

        // Subscribe observers
        subject.subscribe(euroStore);
        subject.subscribe(usStore);

        // Notify observers of a new product
        System.out.println("Notifying all stores about iPhone20:");
        subject.notifyNewProduct("NEW_PRODUCT", "iPhone20");

        // Unsubscribe one observer
        System.out.println("\nUnsubscribing US Store...");
        subject.unsubscribe(usStore);

        // Notify again with only one observer
        System.out.println("\nNotifying remaining stores about MacBook Pro:");
        subject.notifyNewProduct("NEW_PRODUCT", "MacBook Pro");
    }
}

package com.znaji.abstractFactory.example2;

public class AdminSmsNotification implements Notifier {
    @Override
    public void notify(String recipient, String content) {
        System.out.printf("[Admin SMS]   To %s: %s%n", recipient, content);
    }
}

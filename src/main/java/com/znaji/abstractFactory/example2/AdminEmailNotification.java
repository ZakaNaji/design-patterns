package com.znaji.abstractFactory.example2;

public class AdminEmailNotification implements Notifier {
    @Override
    public void notify(String recipient, String content) {
        System.out.printf("[Admin Email] To %s: %s%n", recipient, content);
    }
}

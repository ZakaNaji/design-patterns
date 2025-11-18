package com.znaji.abstractFactory.example2;

public class UserSmsNotification implements Notifier {
    @Override
    public void notify(String recipient, String content) {
        System.out.printf("[User SMS] To %s: %s%n", recipient, content);
    }
}

package com.znaji.abstractFactory.example2;

public class UserEmailNotification implements Notifier {
    @Override
    public void notify(String recipient, String content) {
        System.out.printf("[User Email] To %s: %s%n", recipient, content);

    }
}

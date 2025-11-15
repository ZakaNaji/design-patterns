package com.znaji.abstractFactory.example1.services.impl;

import com.znaji.abstractFactory.example1.services.EmailNotification;

public class UserEmailNotification implements EmailNotification {

    @Override
    public void sendEmailNotification(String email, String content) {
        System.out.printf("[User Email]   To: %s — %s%n", email, content);
    }
}

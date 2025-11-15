package com.znaji.abstractFactory.example1.services.impl;

import com.znaji.abstractFactory.example1.services.SmsNotification;

public class UserSmsNotification implements SmsNotification {

    @Override
    public void sendSmsNotification(String number, String content) {
        System.out.printf("[User SMS]    To: %s — %s%n", number, content);
    }
}
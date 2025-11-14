package com.znaji.factory.example1;

public class SmsNotification implements Notification{
    @Override
    public void NotifyUser() {
        System.out.println("--SMS-- notif: something just happened");
    }
}

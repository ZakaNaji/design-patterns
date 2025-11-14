package com.znaji.factory.example1;

public class EmailNotification implements Notification{
    @Override
    public void NotifyUser() {
        System.out.println("--EMAIL-- notif: something just happened");
    }
}

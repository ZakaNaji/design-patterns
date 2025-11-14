package com.znaji.factory.example1;

public class WhatsappNotification implements Notification{
    @Override
    public void NotifyUser() {
        System.out.println("--WhatsApp-- notif: something just happened");
    }
}

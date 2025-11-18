package com.znaji.abstractFactory.example2;

public class SystemNotificationClient {

    private final NotificationFactory factory;

    public SystemNotificationClient(NotificationFactory factory) {
        this.factory = factory;
    }

    public void notifyViaEmail(String recipient, String content) {
        factory.createEmailNotification().notify(recipient, content);
    }

    public void notifyViaSms(String recipient, String content) {
        factory.createSmsNotification().notify(recipient, content);
    }
}

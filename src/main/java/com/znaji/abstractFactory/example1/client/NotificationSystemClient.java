package com.znaji.abstractFactory.example1.client;

import com.znaji.abstractFactory.example1.factory.NotificationFactory;
import com.znaji.abstractFactory.example1.factory.impl.AdminNotificationFactory;
import com.znaji.abstractFactory.example1.factory.impl.UserNotificationFactory;

public class NotificationSystemClient {
    enum NotificationType {EMAIL, SMS}
    enum NotificationSender {ADMIN, USER}

    private NotificationFactory notificationFactory;

    public NotificationSystemClient(NotificationSender sender) {
        switch (sender) {
            case ADMIN:
                notificationFactory = new AdminNotificationFactory();
                break;
            case USER:
                notificationFactory =new UserNotificationFactory();
                break;
        }
    }

    public void sendNotification(NotificationType type, String recipient, String content) {
        switch (type) {
            case EMAIL:
                notificationFactory.createEmailNotification().sendEmailNotification(recipient, content);
                break;
            case SMS:
                notificationFactory.createSmsNotification().sendSmsNotification(recipient, content);
                break;
        }
    }

    public static NotificationSystemClient adminClient() {
        return new NotificationSystemClient(NotificationSender.ADMIN);
    }

    public static NotificationSystemClient userClient() {
        return new NotificationSystemClient(NotificationSender.USER);
    }

    public void sendEmailNotification(String recipient, String content) {
        sendNotification(NotificationType.EMAIL, recipient, content);
    }

    public void sendSmsNotification(String recipient, String content) {
        sendNotification(NotificationType.SMS, recipient, content);
    }
}

package com.znaji.abstractFactory.example2;

public class AdminNotificationFactoryImpl implements NotificationFactory {
    @Override
    public Notifier createEmailNotification() {
        return new AdminEmailNotification();
    }

    @Override
    public Notifier createSmsNotification() {
        return new AdminSmsNotification();
    }
}

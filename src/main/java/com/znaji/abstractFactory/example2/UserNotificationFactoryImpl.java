package com.znaji.abstractFactory.example2;

public class UserNotificationFactoryImpl implements NotificationFactory {
    @Override
    public Notifier createEmailNotification() {
        return new UserEmailNotification();
    }

    @Override
    public Notifier createSmsNotification() {
        return new UserSmsNotification();
    }
}

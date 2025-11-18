package com.znaji.abstractFactory.example2;

public interface NotificationFactory {
    Notifier createEmailNotification();
    Notifier createSmsNotification();
}

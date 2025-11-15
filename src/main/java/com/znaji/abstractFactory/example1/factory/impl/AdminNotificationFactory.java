package com.znaji.abstractFactory.example1.factory.impl;

import com.znaji.abstractFactory.example1.factory.NotificationFactory;
import com.znaji.abstractFactory.example1.services.EmailNotification;
import com.znaji.abstractFactory.example1.services.SmsNotification;
import com.znaji.abstractFactory.example1.services.impl.AdminEmailNotification;
import com.znaji.abstractFactory.example1.services.impl.AdminSmsNotification;

public class AdminNotificationFactory implements NotificationFactory {
    @Override
    public SmsNotification createSmsNotification() {
        return new AdminSmsNotification();
    }

    @Override
    public EmailNotification createEmailNotification() {
        return new AdminEmailNotification();
    }
}
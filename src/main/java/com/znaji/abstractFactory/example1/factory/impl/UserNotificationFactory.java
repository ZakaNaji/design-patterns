package com.znaji.abstractFactory.example1.factory.impl;

import com.znaji.abstractFactory.example1.factory.NotificationFactory;
import com.znaji.abstractFactory.example1.services.EmailNotification;
import com.znaji.abstractFactory.example1.services.SmsNotification;
import com.znaji.abstractFactory.example1.services.impl.UserEmailNotification;
import com.znaji.abstractFactory.example1.services.impl.UserSmsNotification;

public class UserNotificationFactory implements NotificationFactory {
    @Override
    public SmsNotification createSmsNotification() {
        return new UserSmsNotification();
    }

    @Override
    public EmailNotification createEmailNotification() {
        return new UserEmailNotification();
    }
}

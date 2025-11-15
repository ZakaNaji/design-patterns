package com.znaji.abstractFactory.example1.factory;

import com.znaji.abstractFactory.example1.services.impl.AdminSmsNotification;
import com.znaji.abstractFactory.example1.services.EmailNotification;
import com.znaji.abstractFactory.example1.services.SmsNotification;

public interface NotificationFactory {
    SmsNotification createSmsNotification();
    EmailNotification createEmailNotification();

}

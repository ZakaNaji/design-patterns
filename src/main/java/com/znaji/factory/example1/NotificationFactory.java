package com.znaji.factory.example1;

public class NotificationFactory {

    static Notification createNotif(NotifType type) {
        return switch (type) {
            case SMS -> new SmsNotification();
            case WHATSAPP -> new WhatsappNotification();
            case EMAIL -> new EmailNotification();
        };
    }

    public enum NotifType {SMS, WHATSAPP, EMAIL};
}

package com.znaji.abstractFactory.example1;

import com.znaji.abstractFactory.example1.client.NotificationSystemClient;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern Example");
        NotificationSystemClient adminClient =  NotificationSystemClient.adminClient();
        adminClient.sendEmailNotification("support@all.com", "System maintenance at 2 AM");
        adminClient.sendSmsNotification("+1234567890", "System maintenance at 2 AM");

        NotificationSystemClient userClient = NotificationSystemClient.userClient();
        userClient.sendEmailNotification("admin@group.com", "Request for account upgrade");
        userClient.sendSmsNotification("+0987654321", "Request for account upgrade");
    }
}

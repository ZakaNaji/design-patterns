package com.znaji.abstractFactory.example2;

public class Main {
    public static void main(String[] args) {
        var userClient = new SystemNotificationClient(new UserNotificationFactoryImpl());
        userClient.notifyViaEmail("users@gmail.com", "Maintenance at 2AM");
        userClient.notifyViaSms("066661020", "No action during Maintenance");
    }
}

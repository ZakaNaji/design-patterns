package com.znaji.strategy.pattern.payment;

import java.util.List;

public class PayPalPaymentStrategy implements PaymentStrategy {
    private final List<String> clients = List.of("john.doe@example.com");
    private String mail;
    public PayPalPaymentStrategy(String mail) {
        this.mail = mail;
    }

    @Override
    public void processPayment(double v) {
        if (clients.contains(mail)) {
            var message = String.format(
                    "Client %s paid %f with PayPal", mail, v
            );
            System.out.println(message);
        } else {
            System.out.println("Wrong credentials");
        }
    }
}

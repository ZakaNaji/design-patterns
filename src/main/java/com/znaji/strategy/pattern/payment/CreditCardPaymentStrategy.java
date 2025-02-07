package com.znaji.strategy.pattern.payment;

import java.util.Map;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private final Map<String, String> clients = Map.of("John Doe", "1234-5678-9876-5432");

    private String name;
    private String cardNumber;

    public CreditCardPaymentStrategy(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double v) {
        String clientNumber = clients.get(name);
        if (clientNumber != null && clientNumber.equals(cardNumber)) {
            var message = String.format("Client %s with card %s paid %f with CreditCard", name, cardNumber, v);
            System.out.println(message);
        } else {
            System.out.println("Wrong credentialss");
        }
    }
}

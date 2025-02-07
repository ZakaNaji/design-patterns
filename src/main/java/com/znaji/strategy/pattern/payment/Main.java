package com.znaji.strategy.pattern.payment;

public class Main {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPaymentStrategy("John Doe", "1234-5678-9876-5432"));
        context.pay(100.0);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPaymentStrategy("john.doe@example.com"));
        context.pay(50.0);

        // Pay using Bitcoin
        context.setPaymentStrategy(new BitcoinPaymentStrategy("1FfmbHfnpaZjKFvyi1okTjJJusN455paPH"));
        context.pay(75.0);
    }
}

package com.znaji.strategy.pattern.payment;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double v) {
        paymentStrategy.processPayment(v);
    }
}

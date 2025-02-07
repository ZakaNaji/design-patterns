package com.znaji.strategy.pattern.payment;

import java.util.List;

public class BitcoinPaymentStrategy implements PaymentStrategy {

    private List<String> clientsWallets = List.of(
            "1FfmbHfnpaZjKFvyi1okTjJJusN455paPH"
    );

    private String walletId;
    public BitcoinPaymentStrategy(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void processPayment(double v) {
        if (clientsWallets.contains(walletId)) {
            var message = String.format("Client with walled id %s paid %f with Bitcoin", walletId, v);
            System.out.println(message);
        } else {
            System.out.println("Wrong credentials");
        }
    }
}

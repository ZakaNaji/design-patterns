package com.znaji.composite;
import java.math.BigDecimal;

public class OutdoorStoreDemo {

    public static void main(String[] args) {
        // empty kit example:
        EquipmentKit emptyKit = new EquipmentKit("Empty Kit");

        // price and weight of the empty kit
        BigDecimal emptyKitPrice = emptyKit.price();
        int emptyKitWeight = emptyKit.weightInGrams();

        System.out.println("Empty Kit Price: " + emptyKitPrice);
        System.out.println("Empty Kit Weight: " + emptyKitWeight + "g");
    }
}

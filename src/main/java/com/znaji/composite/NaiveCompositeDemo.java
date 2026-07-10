package com.znaji.composite;

import java.math.BigDecimal;

public class NaiveCompositeDemo {

    public static void main(String[] args) {
        Product stove = new Product(
                "Portable Stove",
                new BigDecimal("450.00"),
                800
        );

        Product pot = new Product(
                "Camping Pot",
                new BigDecimal("230.00"),
                500
        );

        EquipmentKit cookingKit = new EquipmentKit("Cooking Kit");

        cookingKit.addProduct(stove);
        cookingKit.addProduct(pot);
    }
}

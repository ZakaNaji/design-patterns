package com.znaji.composite;

import java.math.BigDecimal;

public class NaiveCompositeDemo {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();
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

        Product tent = new Product(
                "Camping Tent",
                new BigDecimal("1200.00"),
                5000
        );

        EquipmentKit cookingKit = new EquipmentKit("Cooking Kit");

        //cookingKit.addProduct(stove);
        //cookingKit.addProduct(pot);
//
        //EquipmentKit campingKit = new EquipmentKit("Camping Kit");
        //campingKit.addProduct(tent);
        //cookingKit.addSubKit(campingKit);
//
        //BigDecimal totalPrice = checkout.calculatePrice(cookingKit);
        //System.out.println("Total price of the cooking kit: " + totalPrice);
    }
}

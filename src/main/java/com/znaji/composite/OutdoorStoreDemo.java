package com.znaji.composite;
import java.math.BigDecimal;

public class OutdoorStoreDemo {

    public static void main(String[] args) {
        Product fireStarter = new Product(
                "Fire Starter",
                new BigDecimal("120.00"),
                100
        );

        Product waterFilter = new Product(
                "Water Filter",
                new BigDecimal("300.00"),
                250
        );

        Product tarp = new Product(
                "Tarp",
                new BigDecimal("400.00"),
                900
        );

        Product campingPot = new Product(
                "Camping Pot",
                new BigDecimal("230.00"),
                500
        );

        Product portableStove = new Product(
                "Portable Stove",
                new BigDecimal("450.00"),
                800
        );

        EquipmentKit cookingKit =
                new EquipmentKit("Cooking Kit");

        cookingKit.add(campingPot);
        cookingKit.add(portableStove);

        EquipmentKit weekendPack =
                new EquipmentKit("Weekend Survival Pack");

        weekendPack.add(fireStarter);
        weekendPack.add(waterFilter);
        weekendPack.add(tarp);
        weekendPack.add(cookingKit);

        weekendPack.print("");

        System.out.println();
        System.out.println(
                "Total price: " + weekendPack.price()
        );
        System.out.println(
                "Total weight: "
                        + weekendPack.weightInGrams()
                        + "g"
        );
    }
}

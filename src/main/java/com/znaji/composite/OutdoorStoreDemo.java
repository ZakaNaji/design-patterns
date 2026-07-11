package com.znaji.composite;
import java.math.BigDecimal;

public class OutdoorStoreDemo {

    public static void main(String[] args) {
        // cyclic graph of equipment kits
        EquipmentKit expedition = new EquipmentKit("Expedition");
        EquipmentKit cooking = new EquipmentKit("Cooking");
        EquipmentKit emergency = new EquipmentKit("Emergency");

        expedition.add(cooking);
        cooking.add(emergency);

        // unsupported operation:
        try {
            expedition.add(emergency);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        expedition.print("");
    }
}

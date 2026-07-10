package com.znaji.composite;

import java.math.BigDecimal;

public final class Checkout {

    // this is a design smell, because we are using instanceof to determine the type of the object, which is not a good practice in OOP. We should use polymorphism instead.
    public BigDecimal calculatePrice(Object selectedItem) {

        if (selectedItem instanceof Product product) {
            return product.getPrice();
        } else if (selectedItem instanceof EquipmentKit kit) {
            return kit.totalPrice();
        } else {
            throw new IllegalArgumentException("Unknown item type: " + selectedItem.getClass().getName());
        }
    }

}

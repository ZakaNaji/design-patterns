package com.znaji.composite;

import java.math.BigDecimal;
import java.util.Objects;

public final class Product implements EquipmentComponent {

    private final String name;
    private final BigDecimal price;
    private final int weightInGrams;

    public Product(String name, BigDecimal price, int weightInGrams) {
        this.name = requireText(name);
        this.price = requireNonNegative(price);
        if (weightInGrams < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weightInGrams = weightInGrams;
    }
    @Override
     public String name() {
        return name;
    }

    @Override
    public BigDecimal price() {
        return price;
    }

    @Override
    public int weightInGrams() {
        return weightInGrams;
    }

    @Override
    public void print(String indentation) {
        System.out.printf(
                "%s- %s [price=%s, weight=%dg]%n",
                indentation,
                name,
                price,
                weightInGrams
        );
    }


    private String requireText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Text cannot be null or empty");
        }
        return text;
    }

    private BigDecimal requireNonNegative(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Value cannot be null or negative");
        }
        return value;
    }

}
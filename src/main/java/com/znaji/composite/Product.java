package com.znaji.composite;

import java.math.BigDecimal;
import java.util.Objects;

public final class Product {

    private final String name;
    private final BigDecimal price;
    private final int weightInGrams;

    public Product(String name, BigDecimal price, int weightInGrams) {
        this.name = Objects.requireNonNull(name, "Product name cannot be null");
        this.price = Objects.requireNonNull(price, "Product price cannot be null");
        this.weightInGrams = weightInGrams;
    }
     public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }



}
package com.znaji.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class EquipmentKit  {

    private final String name;
    private final List<Product> products = new ArrayList<>();

    public EquipmentKit(String name) {
        this.name = Objects.requireNonNull(name, "Equipment kit name cannot be null");
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void addProduct(Product product) {
        products.add(Objects.requireNonNull(product, "Product cannot be null"));
    }

    public BigDecimal totalPrice() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public int totalWeightInGrams() {
        return products.stream()
                .mapToInt(Product::getWeightInGrams)
                .sum();
    }
}

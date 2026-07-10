package com.znaji.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class EquipmentKit  {

    private final String name;
    private final List<Product> products = new ArrayList<>();
    //Kit should also accept sub-kits:
    private final List<EquipmentKit> subKits = new ArrayList<>();

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

    public void addSubKit(EquipmentKit subKit) {
        subKits.add(Objects.requireNonNull(subKit, "Sub-kit cannot be null"));
    }

    // Method to calculate the total price of the kit, including sub-kits
    public BigDecimal totalPrice() {
        BigDecimal productsTotal = products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal subKitsTotal = subKits.stream()
                .map(EquipmentKit::totalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return productsTotal.add(subKitsTotal);
    }

    // Method to calculate the total weight of the kit, including sub-kits
    public int totalWeightInGrams() {
        int productsTotal = products.stream()
                .mapToInt(Product::getWeightInGrams)
                .sum();

        int subKitsTotal = subKits.stream()
                .mapToInt(EquipmentKit::totalWeightInGrams)
                .sum();

        return productsTotal + subKitsTotal;
    }
}

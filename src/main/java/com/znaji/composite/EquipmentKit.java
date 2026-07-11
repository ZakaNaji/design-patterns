package com.znaji.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class EquipmentKit implements EquipmentComponent {

    private static final String INDENT = "  ";
    private final String name;
    private final List<EquipmentComponent> children = new ArrayList<>();


    public EquipmentKit(String name) {
        this.name = requireText(name);
    }

    @Override
    public String name() {
        return name;
    }

    public void add(EquipmentComponent component) {
        if (component == this) {
            throw new IllegalArgumentException("Cannot add a component to itself");
        }

        if (component instanceof EquipmentKit kit && kit.containsRecursively(this)) {
            throw new IllegalArgumentException("Cannot add a component that contains this kit");
        }
        children.add(Objects.requireNonNull(
                component,
                "Component cannot be null"
        ));
    }

    public void remove(EquipmentComponent component) {
        children.remove(Objects.requireNonNull(
                component,
                "Component cannot be null"
        ));
    }

    public List<EquipmentComponent> children() {
        return List.copyOf(children);
    }

    @Override
    public BigDecimal price() {
        return children.stream()
                .map(EquipmentComponent::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public int weightInGrams() {
        return children.stream()
                .mapToInt(EquipmentComponent::weightInGrams)
                .sum();
    }

    @Override
    public void print(String indentation) {
        System.out.println(indentation + "+ " + name);

        String childIndentation = indentation + INDENT;

        children.forEach(
                child -> child.print(childIndentation)
        );
    }

    private String requireText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Text cannot be null or empty");
        }
        return text;
    }

    private boolean containsRecursively(EquipmentComponent child) {
        if (this == child) {
            return true;
        }
        return children.stream()
                .filter(EquipmentKit.class::isInstance)
                .map(EquipmentKit.class::cast)
                .anyMatch(kit -> kit.containsRecursively(child));
    }
}

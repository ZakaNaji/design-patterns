package com.znaji.composite;

public interface EquipmentComponent extends Priceable{

    String name();

    int weightInGrams();

    void print(String indentation);
}

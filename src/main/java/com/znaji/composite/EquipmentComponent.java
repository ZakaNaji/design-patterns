package com.znaji.composite;

public abstract class EquipmentComponent implements Priceable{

    private EquipmentKit parent;

    public abstract String name();

    public abstract int weightInGrams();

    public abstract void print(String indentation);

    public final EquipmentKit parent() {
        return parent;
    }

    final void attachTo(EquipmentKit newParent) {
        if (parent != null) {
            throw new IllegalStateException("Component is already attached to a parent");
        }
        parent = newParent;
    }

    final void detachFrom(EquipmentKit kit) {
        if (parent != kit) {
            throw new IllegalStateException("Component is not attached to the specified parent");
        }
        parent = null;
    }
}

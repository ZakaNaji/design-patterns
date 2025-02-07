package com.znaji.strategy.pattern.characters;

public abstract class Character {

    private WeaponBehaviour weaponBehaviour;

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void fight() {
        weaponBehaviour.useWeapon();
    }
}

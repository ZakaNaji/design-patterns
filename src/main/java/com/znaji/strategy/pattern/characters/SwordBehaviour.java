package com.znaji.strategy.pattern.characters;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Use Holly sword to cut evil!");
    }
}

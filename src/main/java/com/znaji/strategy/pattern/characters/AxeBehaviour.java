package com.znaji.strategy.pattern.characters;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Use Axe to brutally dispatch of enemies!");
    }
}

package com.znaji.strategy.pattern;

public class Main {

    public static void main(String[] args) {
        Character knight = new Knight();
        Character troll = new Troll();

        knight.setWeaponBehaviour(new SwordBehaviour());
        troll.setWeaponBehaviour(new AxeBehaviour());

        knight.fight();
        troll.fight();
    }
}

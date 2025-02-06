package com.znaji.intro;

public class RedHeadDuck extends Duck implements Flyable{

    @Override
    public void display() {
        System.out.println("This is a Red Head Duck!");
    }

    @Override
    public void fly() {
        System.out.println("Red head duck do fly");
    }
}

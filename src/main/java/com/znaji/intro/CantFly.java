package com.znaji.intro;

public class CantFly implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("This duck can't fly");
    }
}

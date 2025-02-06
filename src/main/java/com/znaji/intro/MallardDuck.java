package com.znaji.intro;

public class MallardDuck extends Duck implements Flyable{

    @Override
    public void display() {
        System.out.println("This is a Mallard Duck!");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck do fly");
    }
}

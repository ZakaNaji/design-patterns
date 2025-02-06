package com.znaji.intro;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        rubberDuck.display();
        ((Flyable)mallard).fly();
    }
}

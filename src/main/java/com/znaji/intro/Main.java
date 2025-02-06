package com.znaji.intro;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        mallard.setFlyingBehaviour(new FlyWithWings());
        mallard.performFlying();

        rubberDuck.setFlyingBehaviour(new CantFly());
        rubberDuck.performFlying();

    }
}

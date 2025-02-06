package com.znaji.intro;

public abstract class Duck {

    protected FlyingBehaviour flyingBehaviour;

    protected void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void performFlying() {
        flyingBehaviour.fly();
    }

    public abstract void display();

}

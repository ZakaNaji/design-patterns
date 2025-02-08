package com.znaji.observer.pattern;

public class CurrentConditionsDisplay implements Observer, Displayable{
    private double temperature;
    private double humidity;

    @Override
    public void update(double temperature, double humidity, double p) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}

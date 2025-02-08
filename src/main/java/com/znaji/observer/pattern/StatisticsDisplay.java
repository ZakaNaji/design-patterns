package com.znaji.observer.pattern;

public class StatisticsDisplay implements Observer, Displayable{
    private double maxTemp = 0.0f;
    private double minTemp = 200;
    private double tempSum= 0.0f;
    private int numReadings;

    @Override
    public void update(double temp, double h, double p) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}

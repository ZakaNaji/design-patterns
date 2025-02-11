package com.znaji.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private final List<Observer> observers = new ArrayList<>();

    private double temperature;
    private double humidity;
    private double pressure;


    @Override
    public void registerObserver(Observer o) {
        if (observers.contains(o)) return;
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void measurementsChange(double temperature, double humidity, double pressure) {
        if (conditionsChanged(temperature, humidity, pressure)) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            notifyObservers();
        }

    }

    private boolean conditionsChanged(double temperature, double humidity, double pressure) {
        return (this.temperature != temperature || this.humidity != humidity || this.pressure != pressure);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}

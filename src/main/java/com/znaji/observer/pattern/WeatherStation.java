package com.znaji.observer.pattern;

public class WeatherStation {

    public static void main(String[] args) throws InterruptedException {
        var weatherData = new WeatherData();

        var currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        var statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);


        weatherData.measurementsChange(30, 70, 25);

        Thread.sleep(3000);

        weatherData.measurementsChange(31, 72, 22);

        Thread.sleep(3000);

        weatherData.measurementsChange(31, 72, 22);
    }
}

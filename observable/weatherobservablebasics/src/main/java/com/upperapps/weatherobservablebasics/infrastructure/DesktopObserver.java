package com.upperapps.weatherobservablebasics.infrastructure;

import com.upperapps.weatherobservablebasics.domain.IDisplay;
import com.upperapps.weatherobservablebasics.domain.IObserver;

public class DesktopObserver implements IObserver, IDisplay{

    private final WeatherObservable weatherObservable;

    public DesktopObserver (WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
        this.weatherObservable.addObserver(this);
    }

    @Override
    public void display(String message) {
        System.out.println("Weather message on a desktop - " + message);
    }

    @Override
    public void update() {
        String message = "temperature: " + weatherObservable.getWeather().getTemperature() + "C"
                + " umidity: " + weatherObservable.getWeather().getUmidity() + "%"
                + " wind speed: " + weatherObservable.getWeather().getWindSpeed() + " Km/h";
        display(message);
    }

}
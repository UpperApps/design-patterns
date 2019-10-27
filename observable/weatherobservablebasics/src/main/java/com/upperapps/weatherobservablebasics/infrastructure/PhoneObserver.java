package com.upperapps.weatherobservablebasics.infrastructure;

import com.upperapps.weatherobservablebasics.domain.IDisplay;
import com.upperapps.weatherobservablebasics.domain.IObserver;

public class PhoneObserver implements IObserver, IDisplay {

    private final WeatherObservable weatherObservable;

    
    public PhoneObserver(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
        weatherObservable.addObserver(this);
    }

    @Override
    public void display(String message) {
        System.out.println("Weather message on a phone - " + message);
    }

    @Override
    public void update() {
        String message = "temperature: " + weatherObservable.getWeather().getTemperature() + "C"
                + " umidity: " + weatherObservable.getWeather().getUmidity() + "%";
        display(message);
    }

}
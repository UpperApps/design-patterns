package com.upperapps.weatherobservablebasics;

import com.upperapps.weatherobservablebasics.domain.Weather;
import com.upperapps.weatherobservablebasics.infrastructure.DesktopObserver;
import com.upperapps.weatherobservablebasics.infrastructure.PhoneObserver;
import com.upperapps.weatherobservablebasics.infrastructure.WeatherObservable;

public class MainApplication {

    public static void main(String[] args) {

        System.out.println("\nRunnig Application \n============================== \n1st Run \n");

        WeatherObservable weatherObservable = WeatherObservable.create();

        Weather weather = Weather.create(25, 17, 80);
        weatherObservable.setWeather(weather);

        new PhoneObserver(weatherObservable);
        new DesktopObserver(weatherObservable);

        weatherObservable.notifyObservers();

        System.out.println("\nRunnig weather update \n");

        Weather weatherUpdated = Weather.create(30, 6, 90);
        weatherObservable.setWeather(weatherUpdated);

        weatherObservable.notifyObservers();
    }
}
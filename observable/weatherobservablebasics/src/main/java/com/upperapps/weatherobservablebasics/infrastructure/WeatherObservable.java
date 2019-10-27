package com.upperapps.weatherobservablebasics.infrastructure;

import com.upperapps.weatherobservablebasics.domain.IObservable;
import com.upperapps.weatherobservablebasics.domain.Weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(staticName = "create")
@Getter @Setter
public class WeatherObservable implements IObservable{

    private Weather weather;
}
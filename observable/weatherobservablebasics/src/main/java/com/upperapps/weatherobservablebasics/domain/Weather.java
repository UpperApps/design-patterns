package com.upperapps.weatherobservablebasics.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "create")
@Getter
public class Weather {

    private final int temperature;
    private final int windSpeed;
    private final int umidity;

}
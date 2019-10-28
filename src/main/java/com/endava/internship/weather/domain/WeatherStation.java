package com.endava.internship.weather.domain;

import org.springframework.stereotype.Service;

@Service
public class WeatherStation implements WeatherService {

    @Override
    public String readSensorData() {
        return "17°C";
    }
}

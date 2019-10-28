package com.endava.internship.weather.config;

import com.endava.internship.weather.domain.WeatherStation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = WeatherStation.class)
public class WeatherStationConfig {
}

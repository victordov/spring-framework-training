package com.endava.internship.smarthouse.config;

import com.endava.internship.smarthouse.domain.sensor.Sensor;
import com.endava.internship.smarthouse.domain.sensor.security.DoorSensor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecuritySensorConfig {

    @Bean
    public Sensor doorSensor() {
        return new DoorSensor(RandomStringUtils.randomNumeric(8));
    }
}

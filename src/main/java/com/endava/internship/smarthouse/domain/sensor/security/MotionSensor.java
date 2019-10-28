package com.endava.internship.smarthouse.domain.sensor.security;

import com.endava.internship.smarthouse.domain.sensor.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MotionSensor implements SecuritySensor {

    private String id;

    public MotionSensor() {
    }

    public MotionSensor(
        @Autowired
        @Qualifier("smokeSensor")
            Sensor smomkeSensor

    ) {
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

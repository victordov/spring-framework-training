package com.endava.internship.smarthouse.domain.sensor.comfort;

import com.endava.internship.smarthouse.domain.sensor.SystemOfMeasurement;
import org.apache.commons.lang3.RandomStringUtils;

public class HumiditySensor implements ComfortSensor {

    private final String id;

    public HumiditySensor(String id) {
        this.id = id;
    }


    @Override
    public String readSensorValue() {
        return RandomStringUtils.randomAlphanumeric(2) + SystemOfMeasurement.Metric;
    }

    @Override
    public String getId() {
        return id;
    }
}

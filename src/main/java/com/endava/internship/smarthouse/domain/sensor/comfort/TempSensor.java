package com.endava.internship.smarthouse.domain.sensor.comfort;

import com.endava.internship.smarthouse.domain.sensor.SystemOfMeasurement;
import org.apache.commons.lang3.RandomStringUtils;

public class TempSensor implements ComfortSensor {

    private String id;

    public TempSensor(String id) {
        this.id = id;
    }

    @Override
    public String getId() {

        return id;
    }

    @Override
    public String readSensorValue() {
        return RandomStringUtils.randomAlphanumeric(2) + SystemOfMeasurement.Metric.getTempSymbol();
    }
}

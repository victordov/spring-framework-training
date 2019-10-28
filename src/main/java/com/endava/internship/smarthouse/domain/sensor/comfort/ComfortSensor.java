package com.endava.internship.smarthouse.domain.sensor.comfort;

import com.endava.internship.smarthouse.domain.sensor.Sensor;

public interface ComfortSensor extends Sensor {

    String readSensorValue();
}

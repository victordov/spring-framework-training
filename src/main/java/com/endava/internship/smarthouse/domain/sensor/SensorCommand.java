package com.endava.internship.smarthouse.domain.sensor;

import com.endava.internship.smarthouse.domain.Result;

public abstract class SensorCommand {

    public abstract Result execute(Sensor sensor);
}

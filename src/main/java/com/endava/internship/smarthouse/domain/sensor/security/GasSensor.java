package com.endava.internship.smarthouse.domain.sensor.security;

//Security
public class GasSensor implements SecuritySensor {

    private final String id;

    public GasSensor(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}

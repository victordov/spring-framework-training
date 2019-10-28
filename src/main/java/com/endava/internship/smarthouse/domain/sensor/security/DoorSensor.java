package com.endava.internship.smarthouse.domain.sensor.security;

public class DoorSensor implements SecuritySensor {

    private String version;

    private final String id;

    public DoorSensor(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

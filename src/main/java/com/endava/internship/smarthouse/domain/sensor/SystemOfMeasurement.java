package com.endava.internship.smarthouse.domain.sensor;

public enum SystemOfMeasurement {

    Imperial("℉", "not_defined"), Metric("℃", "g/m3"),
    ;

    private final String humidity;

    SystemOfMeasurement(String temp, String humidity) {
        this.temp = temp;
        this.humidity = humidity;
    }

    private final String temp;

    public String getTempSymbol() {
        return temp;
    }

    public String getHumidity() {
        return humidity;
    }
}

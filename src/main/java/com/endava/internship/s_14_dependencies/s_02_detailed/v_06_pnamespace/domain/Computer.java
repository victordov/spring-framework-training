package com.endava.internship.s_14_dependencies.s_02_detailed.v_06_pnamespace.domain;

public class Computer {

    private String model;
    private Double frequency;

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "model='" + model + '\'' +
            ", frequency=" + frequency +
            '}';
    }
}

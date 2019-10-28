package com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.domain;

import org.springframework.stereotype.Component;

@Component
public class FlighTerminal {

    private String systemAuthorization;

    public void setSystemAuthorization(String systemAuthorization) {
        this.systemAuthorization = systemAuthorization;
    }

    @Override
    public String toString() {
        return "FlighTerminal{" +
            "systemAuthorization='" + systemAuthorization + '\'' +
            '}';
    }
}

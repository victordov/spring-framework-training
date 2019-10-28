package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Taxi {

    @Autowired
    private Driver driver;

    public void printDriverLicense() {
        System.out.println(driver.toString());
    }
}

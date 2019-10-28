package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.config.inward;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Taxi2 {

    @Autowired
    private Driver2 driver2;

    public void printDriverLicense() {
        System.out.println(driver2.toString());
    }
}

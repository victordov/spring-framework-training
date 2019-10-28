package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.domain.propertybased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularB {

    @Autowired
    CircularA circularA;
}

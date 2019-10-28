package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.domain.constructorbased;

import org.springframework.stereotype.Component;

@Component
public class CircularD {

    public CircularD(CircularC circularC) {

    }
}

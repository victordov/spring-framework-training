package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.config.inward.Taxi2;
import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.config.inward.Taxi2Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldBasedContext2App {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Taxi2Config.class);
        appContext.getBean(Taxi2.class).printDriverLicense();
    }
}

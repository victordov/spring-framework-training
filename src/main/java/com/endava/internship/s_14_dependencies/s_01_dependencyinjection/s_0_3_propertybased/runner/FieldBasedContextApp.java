package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.config.TaxiConfig;
import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.domain.Taxi;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldBasedContextApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(TaxiConfig.class);
        appContext.getBean(Taxi.class).printDriverLicense();
    }
}

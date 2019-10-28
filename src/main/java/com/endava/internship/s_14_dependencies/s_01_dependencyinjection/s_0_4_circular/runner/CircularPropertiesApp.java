package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.config.CircularPropertiesConfig;
import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.domain.propertybased.CircularA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularPropertiesApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CircularPropertiesConfig.class);
        System.out.println(ctx.getBean(CircularA.class));
    }
}

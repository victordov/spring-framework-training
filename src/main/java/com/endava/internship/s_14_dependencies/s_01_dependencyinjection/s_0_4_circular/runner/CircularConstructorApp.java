package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.config.CircularConstructorConfig;
import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.domain.constructorbased.CircularC;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularConstructorApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CircularConstructorConfig.class);
        System.out.println(ctx.getBean(CircularC.class));
    }
}

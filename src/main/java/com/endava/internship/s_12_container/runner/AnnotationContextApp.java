package com.endava.internship.s_12_container.runner;

import com.endava.internship.s_12_container.config.ContextConfiguration;
import com.endava.internship.s_12_container.domain.timing.DateTimeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContextApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx =
            new AnnotationConfigApplicationContext(ContextConfiguration.class);

        System.out.println(ctx.getBean(DateTimeService.class).printCurrentTime());
    }
}

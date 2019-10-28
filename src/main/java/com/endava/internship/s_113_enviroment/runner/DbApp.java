package com.endava.internship.s_113_enviroment.runner;

import com.endava.internship.s_113_enviroment.domain.Executor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DbApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan(
            "com.endava.internship.s_113_enviroment.config",
            "com.endava.internship.s_113_enviroment.domain"
        );
        ctx.refresh();

        final Executor app = ctx.getBean(Executor.class);
        app.run();
    }

}

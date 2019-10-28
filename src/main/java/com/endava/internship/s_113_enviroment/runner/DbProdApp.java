package com.endava.internship.s_113_enviroment.runner;

import com.endava.internship.s_113_enviroment.domain.Executor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DbProdApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // can be passed as arguments    -Dspring.profiles.active="profile1,profile2"
        ctx.getEnvironment().setActiveProfiles("production");

        //check if environment contains some bean or property and set environment depending on result
        if (ctx.getEnvironment().containsProperty("custom.property")) {
            //add additional profiles
            ctx.getEnvironment().setActiveProfiles();
        }

        ctx.scan(
            "com.endava.internship.s_113_enviroment.config",
            "com.endava.internship.s_113_enviroment.domain"
        );
        ctx.refresh();

        final Executor app = ctx.getBean(Executor.class);
        app.run();
    }

}

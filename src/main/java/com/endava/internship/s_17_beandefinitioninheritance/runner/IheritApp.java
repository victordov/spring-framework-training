package com.endava.internship.s_17_beandefinitioninheritance.runner;

import com.endava.internship.s_17_beandefinitioninheritance.config.Config;
import com.endava.internship.s_17_beandefinitioninheritance.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IheritApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(ctx.getBean("testUser", User.class));
        System.out.println(ctx.getBean("inheritUser", User.class));
    }
}

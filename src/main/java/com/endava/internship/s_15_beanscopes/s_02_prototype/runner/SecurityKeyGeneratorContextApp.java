package com.endava.internship.s_15_beanscopes.s_02_prototype.runner;

import com.endava.internship.s_15_beanscopes.s_02_prototype.domain.SecurityKeyGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecurityKeyGeneratorContextApp {

    public static void main(String[] args) {
        final ApplicationContext ctx =
            new ClassPathXmlApplicationContext("com/endava/internship/s_15_beanscopes/s_02_prototype/config/s_02_prototype-context.xml");
        System.out.println(ctx.getBean(SecurityKeyGenerator.class).hashSeed());
        System.out.println(ctx.getBean(SecurityKeyGenerator.class).hashSeed());
        System.out.println(ctx.getBean(SecurityKeyGenerator.class).hashSeed());
    }
}

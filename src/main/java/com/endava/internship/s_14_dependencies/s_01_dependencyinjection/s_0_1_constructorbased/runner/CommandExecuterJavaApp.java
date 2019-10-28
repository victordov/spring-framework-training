package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.config.CommandConfig;
import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain.CommandExecutor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CommandExecuterJavaApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CommandConfig.class);
        context.getBean(CommandExecutor.class).executeCommands();
    }
}

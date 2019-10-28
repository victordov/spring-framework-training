package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain.CommandExecutor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CommandExecuterXMLApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
            "com/endava/internship/s_14_dependencies/s_01_dependencyinjection/s_0_1_constructorbased/config/di-command-context_1_4.xml");
        context.getBean(CommandExecutor.class).executeCommands();
    }
}

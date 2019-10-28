package com.endava.internship.s_14_dependencies.s_04_methodinjection.runner;

import com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands.AbstractCommandExecutor;
import com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands.CommandExecutor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class MethodInjectionXmlContextApp {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext("com/endava/internship/s_14_dependencies/s_04_methodinjection/config/methodinjection-context.xml");

        final CommandExecutor commandExecutor = ctx.getBean(CommandExecutor.class);
        commandExecutor.invokeCommand(new HashMap<>());

        ctx.getBean(AbstractCommandExecutor.class).invokeCommand(new HashMap<>());
    }
}

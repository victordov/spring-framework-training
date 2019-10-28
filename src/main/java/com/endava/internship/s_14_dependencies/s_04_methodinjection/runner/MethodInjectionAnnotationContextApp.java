package com.endava.internship.s_14_dependencies.s_04_methodinjection.runner;

import com.endava.internship.s_14_dependencies.s_04_methodinjection.config.MethodInjectionConfig;
import com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands.AbstractCommandExecutorAnnotationBased;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

public class MethodInjectionAnnotationContextApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx =
            new AnnotationConfigApplicationContext(MethodInjectionConfig.class);

        final AbstractCommandExecutorAnnotationBased commandExecutor = ctx.getBean(AbstractCommandExecutorAnnotationBased.class);
        commandExecutor.invokeCommand(new HashMap<>());


    }
}

package com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands;

import org.springframework.context.ApplicationContext;

import java.util.Map;

public abstract class AbstractCommandExecutor {

    private ApplicationContext ctx;

    public boolean invokeCommand(Map<String, Object> params) {
        final Command command = createCommand();
        command.setParams(params);
        return command.execute();
    }

    //Method Injection
    public abstract Command createCommand();
}

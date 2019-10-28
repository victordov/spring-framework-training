package com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public abstract class AbstractCommandExecutorAnnotationBased {

    private ApplicationContext ctx;

    public boolean invokeCommand(Map<String, Object> params) {
        final Command command = createCommand();
        command.setParams(params);
        return command.execute();
    }

    @Lookup
    public abstract Command createCommand();
}

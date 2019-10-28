package com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

public class CommandExecutor implements ApplicationContextAware {

    private ApplicationContext ctx;

    public boolean invokeCommand(Map<String, Object> params) {
        final Command command = createCommand();
        command.setParams(params);
        return command.execute();
    }

    //Method Injection
    public Command createCommand() {
        return ctx.getBean("command", Command.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}

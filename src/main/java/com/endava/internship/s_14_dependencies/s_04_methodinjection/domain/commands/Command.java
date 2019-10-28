package com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands;

import java.util.Map;

public class Command {
    private Map<String, Object> params;

    public boolean execute() {
        System.out.println("invoking command with id: " + this.hashCode());
        return true;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}

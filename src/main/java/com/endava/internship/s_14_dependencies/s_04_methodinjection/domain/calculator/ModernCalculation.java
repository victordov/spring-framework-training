package com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.calculator;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ModernCalculation implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        final String arg = (String) args[0];
        return "new calculation of" + arg;
    }
}

package com.endava.internship.s_14_dependencies.s_04_methodinjection.runner;

import com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.calculator.Calculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodReplacer {
    public static void main(String[] args) {

        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext("com/endava/internship/s_14_dependencies/s_04_methodinjection/config/methodreplacer-context.xml");
        final Calculator calculator = ctx.getBean(Calculator.class);
        System.out.println(calculator.calculate(" 2 + 2"));
    }
}

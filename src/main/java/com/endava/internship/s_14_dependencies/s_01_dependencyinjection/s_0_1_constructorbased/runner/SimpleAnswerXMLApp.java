package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain.SimpleAnswerBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SimpleAnswerXMLApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_01_dependencyinjection/s_0_1_constructorbased/config/di-command-context_1_4.xml");
        System.out.println(context.getBean(SimpleAnswerBean.class));
    }
}

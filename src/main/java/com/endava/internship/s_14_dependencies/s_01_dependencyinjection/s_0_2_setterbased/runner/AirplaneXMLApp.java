package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_2_setterbased.runner;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_2_setterbased.domain.Airplane;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AirplaneXMLApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_01_dependencyinjection/s_0_2_setterbased/config/di-setter-based_1_4.xml");
        System.out.println(ctx.getBean(Airplane.class));
    }
}

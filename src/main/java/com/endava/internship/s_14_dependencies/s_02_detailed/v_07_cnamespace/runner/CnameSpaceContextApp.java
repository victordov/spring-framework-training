package com.endava.internship.s_14_dependencies.s_02_detailed.v_07_cnamespace.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_07_cnamespace.domain.Rocket;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CnameSpaceContextApp {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_07_cnamespace/config/v_07_cnamespace-context.xml");

        System.out.println(ctx.getBean(Rocket.class));
    }
}

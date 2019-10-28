package com.endava.internship.s_14_dependencies.s_02_detailed.v_06_pnamespace.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_06_pnamespace.domain.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PnameSpaceContextApp {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_06_pnamespace/config/v_06_pnamespace-context.xml");

        System.out.println(ctx.getBean("classicComputer", Computer.class));
        System.out.println(ctx.getBean("pNameSpaceComputer", Computer.class));
    }
}

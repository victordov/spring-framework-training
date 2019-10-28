package com.endava.internship.s_14_dependencies.s_02_detailed.v_03_innerbeans.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_03_innerbeans.domain.Outer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeansContextApp {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext
            ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_03_innerbeans/config/v_03_innerbeans-context.xml");

        System.out.println(ctx.getBean(Outer.class).isInnerNull());
        System.out.println(ctx.getBean(Outer.class));

    }
}

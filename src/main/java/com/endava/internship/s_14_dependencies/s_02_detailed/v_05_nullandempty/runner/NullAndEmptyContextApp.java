package com.endava.internship.s_14_dependencies.s_02_detailed.v_05_nullandempty.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_05_nullandempty.domain.CourseNullAndEmpty;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NullAndEmptyContextApp {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_05_nullandempty/config/v_05_nullandempty-context.xml");

        System.out.println(ctx.getBean(CourseNullAndEmpty.class));
    }
}

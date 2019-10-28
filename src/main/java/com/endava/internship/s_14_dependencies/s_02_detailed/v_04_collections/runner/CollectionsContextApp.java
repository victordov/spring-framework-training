package com.endava.internship.s_14_dependencies.s_02_detailed.v_04_collections.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_04_collections.domain.UniversityService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsContextApp {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext
            ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_04_collections/config/v_04_collections-context.xml");

        System.out.println(ctx.getBean("universityServiceParent", UniversityService.class));
        System.out.println(ctx.getBean("universityServiceChild", UniversityService.class));
    }
}

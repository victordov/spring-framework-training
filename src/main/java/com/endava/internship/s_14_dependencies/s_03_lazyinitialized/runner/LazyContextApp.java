package com.endava.internship.s_14_dependencies.s_03_lazyinitialized.runner;

import com.endava.internship.s_14_dependencies.s_03_lazyinitialized.domain.ExpensiveService;
import com.endava.internship.s_14_dependencies.s_03_lazyinitialized.domain.RegularService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyContextApp {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext("com/endava/internship/s_14_dependencies/s_03_lazyinitialized/config/lazyinitialized-context.xml");

        final RegularService regularService = ctx.getBean(RegularService.class);
        final ExpensiveService expensiveService = ctx.getBean(ExpensiveService.class);
        System.out.println(regularService);
        System.out.println(expensiveService);
    }
}

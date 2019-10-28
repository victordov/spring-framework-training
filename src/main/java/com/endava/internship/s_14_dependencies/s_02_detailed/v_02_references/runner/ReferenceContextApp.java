package com.endava.internship.s_14_dependencies.s_02_detailed.v_02_references.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_02_references.domain.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceContextApp {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext(new String[]{
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_02_references/config/reference-child-context.xml"},
                new ClassPathXmlApplicationContext(
                    "com/endava/internship/s_14_dependencies/s_02_detailed/v_02_references/config/reference-context.xml"
                ));
        final AccountService bean = ctx.getBean("accountService", AccountService.class);
        System.out.println(bean);
    }
}

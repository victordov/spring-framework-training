package com.endava.internship.s_14_dependencies.s_02_detailed.v_08_compoundpropertynames.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_08_compoundpropertynames.domain.FriendOne;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompoundNameContextApp {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_08_compoundpropertynames/config/v_08_compoundpropertynames-context.xml");

        System.out.println(ctx.getBean(FriendOne.class));
    }
}

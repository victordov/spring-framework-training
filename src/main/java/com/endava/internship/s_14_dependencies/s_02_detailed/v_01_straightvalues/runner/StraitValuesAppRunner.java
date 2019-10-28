package com.endava.internship.s_14_dependencies.s_02_detailed.v_01_straightvalues.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_01_straightvalues.domain.OracleDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StraitValuesAppRunner {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "com/endava/internship/s_14_dependencies/s_02_detailed/v_01_straightvalues/config/detailed-context.xml");
        System.out.println(ctx.getBean(OracleDataSource.class));
    }
}

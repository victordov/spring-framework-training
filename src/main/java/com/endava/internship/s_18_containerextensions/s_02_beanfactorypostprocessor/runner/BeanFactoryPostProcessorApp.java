package com.endava.internship.s_18_containerextensions.s_02_beanfactorypostprocessor.runner;

import com.endava.internship.s_18_containerextensions.s_02_beanfactorypostprocessor.domain.DataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryPostProcessorApp {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/endava/internship/s_18_containerextensions/s_02_beanfactorypostprocessor/config/beanfactorypostprocessor-context.xml");
        final DataSource bean = ctx.getBean(DataSource.class);
        System.out.println(bean);
    }
}

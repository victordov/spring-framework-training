package com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.runner;

import com.endava.internship.BaseTest;
import com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.config.ContainerExtensionConfig;
import com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.domain.FlighTerminal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = ContainerExtensionConfig.class)
class ContainerExtensionAppTest extends BaseTest {

    @Autowired
    ApplicationContext ctx;

    @Test
    void loadContext() {
        final FlighTerminal terminal = ctx.getBean(FlighTerminal.class);
        System.out.println(terminal);
    }

}

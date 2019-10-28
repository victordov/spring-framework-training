package com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.config;

import com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.domain.FlighTerminal;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {
    FlighTerminal.class, CustomBeanPostProcessor.class

})
public class ContainerExtensionConfig {
}

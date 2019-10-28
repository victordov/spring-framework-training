package com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.config;

import com.endava.internship.s_18_containerextensions.s_01_beanpostprocessor.domain.FlighTerminal;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof FlighTerminal) {
            System.out.println("setting authorization");
            ((FlighTerminal) bean).setSystemAuthorization("Authorization 555_B983");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization of bean: " + beanName);
        return bean;
    }
}

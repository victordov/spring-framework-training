package com.endava.internship.s_12_container.runner.registrations;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DynamicRegistrationOfBeansApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        final DefaultListableBeanFactory listableBeanFactory = (DefaultListableBeanFactory) context.getBeanFactory();

        //register bean definition
        final GenericBeanDefinition outsideConfigBeanDefinition = new GenericBeanDefinition();
        outsideConfigBeanDefinition.setBeanClass(OutsideOfConfig.class);
        listableBeanFactory.registerBeanDefinition(OutsideOfConfig.BEAN_NAME, outsideConfigBeanDefinition);

        //register singleton
        listableBeanFactory.registerSingleton(MySingleton.BEAN_NAME, new MySingleton());

        context.refresh();

        System.out.println(context.getBean(OutsideOfConfig.class));
        System.out.println(context.getBean(MySingleton.class));
    }

    static class MySingleton {

        static String BEAN_NAME = MySingleton.class.getSimpleName().toLowerCase();

        @Override
        public String toString() {
            return "MySingleton is instantiated outside of spring container";
        }
    }

    static class OutsideOfConfig {

        static String BEAN_NAME = OutsideOfConfig.class.getSimpleName().toLowerCase();

        @Override
        public String toString() {
            return OutsideOfConfig.class.getSimpleName() + ": class doesn't take part of regular spring component scanning";
        }
    }
}

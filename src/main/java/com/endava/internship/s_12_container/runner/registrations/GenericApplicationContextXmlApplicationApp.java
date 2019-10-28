package com.endava.internship.s_12_container.runner.registrations;

import com.endava.internship.s_12_container.domain.car.Car;
import com.endava.internship.s_12_container.domain.car.CarStore;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;


public class GenericApplicationContextXmlApplicationApp {

    public static void main(String[] args) {
        final GenericApplicationContext context = new GenericApplicationContext();

        final XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(context);
        xmlReader.loadBeanDefinitions("**/carstore-context.xml");

        context.refresh();

        final CarStore carStore = context.getBean(CarStore.class);
        final Car carSold = carStore.sellCar("red");
        System.out.println(carSold);
    }
}

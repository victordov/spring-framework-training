package com.endava.internship.s_12_container.runner;

import com.endava.internship.s_12_container.domain.car.BmwCarStore;
import com.endava.internship.s_12_container.domain.car.CarStore;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClassPathXmlContextApp {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
            "com/endava/internship/s_12_container/config/carstore-context.xml");
        //By class
        System.out.println(context.getBean(CarStore.class).sellCar("green"));

        //By name defined trough alias
        System.out.println(((BmwCarStore) context.getBean("fastCarStore")).sellCar("black"));
    }
}

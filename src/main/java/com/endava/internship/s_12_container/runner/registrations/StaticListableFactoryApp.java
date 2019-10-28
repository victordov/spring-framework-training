package com.endava.internship.s_12_container.runner.registrations;

import com.endava.internship.s_12_container.domain.car.BmwCarStore;
import com.endava.internship.s_12_container.domain.car.CarStore;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.StaticListableBeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Static BeanFactory implementation which allows to register existing singleton instances programmatically. Does not have support for prototype beans
 * or aliases.
 */
public class StaticListableFactoryApp {

    public static void main(String[] args) {
        final Map<String, Object> map = new HashMap<>();
        map.put("bmwCarStore", new BmwCarStore());
        final BeanFactory beanFactory = new StaticListableBeanFactory(map);
        final CarStore bean = beanFactory.getBean(CarStore.class);
        System.out.println(bean.sellCar("red"));
    }
}

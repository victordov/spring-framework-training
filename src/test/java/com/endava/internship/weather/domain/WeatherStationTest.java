package com.endava.internship.weather.domain;

import com.endava.internship.weather.config.WeatherStationConfig;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = WeatherStationConfig.class)
class WeatherStationTest {

    @Autowired
    BeanFactory beanFactory;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    WeatherStation userService;

    @Test
    void when_weatherStationIsPresent_should_return17C() {
        System.out.println(userService.readSensorData());
        BDDAssertions.then(userService.readSensorData())
            .isNotBlank()
            .isEqualTo("17°C");
    }
}

package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_3_propertybased.domain")

//componentScan scan inward
//@ComponentScan
public class TaxiConfig {

//    @Bean
//    public Taxi taxi() {
//        return new Taxi();
//    }

//    @Bean
//    public Taxi2 taxi2() {
//        return new Taxi2();
//    }
}

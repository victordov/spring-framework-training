package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.config;

import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_4_circular.domain.constructorbased.CircularC;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CircularC.class)
public class CircularConstructorConfig {

}

package com.endava.internship.s_14_dependencies.s_04_methodinjection.config;

import com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands.AbstractCommandExecutorAnnotationBased;
import com.endava.internship.s_14_dependencies.s_04_methodinjection.domain.commands.Command;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AbstractCommandExecutorAnnotationBased.class)
public class MethodInjectionConfig {

    @Bean
    public Command command() {
        return new Command();
    }
}

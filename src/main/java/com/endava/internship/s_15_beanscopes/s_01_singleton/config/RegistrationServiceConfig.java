package com.endava.internship.s_15_beanscopes.s_01_singleton.config;

import com.endava.internship.s_15_beanscopes.s_01_singleton.domain.UserRegistrationService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = UserRegistrationService.class)
public class RegistrationServiceConfig {
}

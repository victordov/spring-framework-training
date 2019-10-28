package com.endava.internship.s_15_beanscopes.s_01_singleton.runner;

import com.endava.internship.s_15_beanscopes.s_01_singleton.config.RegistrationServiceConfig;
import com.endava.internship.s_15_beanscopes.s_01_singleton.domain.UserRegistrationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserRegistrationContextApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx =
            new AnnotationConfigApplicationContext(RegistrationServiceConfig.class);

        final UserRegistrationService userRegistrationService = ctx.getBean(UserRegistrationService.class);
        System.out.println(userRegistrationService);
    }
}

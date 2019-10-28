package com.endava.internship.s_15_beanscopes.s_01_singleton.runner;

import com.endava.internship.s_15_beanscopes.s_01_singleton.config.RegistrationServiceConfig;
import com.endava.internship.s_15_beanscopes.s_01_singleton.domain.UserRegistrationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RegistrationServiceConfig.class)
class UserRegistrationContextAppTest {


    @Autowired
    UserRegistrationService userRegistrationService;

    @Test
    void contextLoads() {
    }
}

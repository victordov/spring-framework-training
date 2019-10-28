package com.endava.internship.s_16_customization.s_01_lifecyclecallbacks.runner;

import com.endava.internship.s_16_customization.s_01_lifecyclecallbacks.config.DatabaseMigrationConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DatabaseMigrationConfig.class)
class LifeCycleTest {


    @Test
    void contextLoads() {

    }
}

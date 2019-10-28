package com.endava.internship.s_16_customization.s_01_lifecyclecallbacks.config;

import com.endava.internship.s_16_customization.s_01_lifecyclecallbacks.domain.DatabaseMigrationServiceCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DatabaseMigrationServiceCallback.class)
public class DatabaseMigrationConfig {

    @Bean
    public DatabaseMigrationServiceCallback b1() {
        return new DatabaseMigrationServiceCallback();
    }

    @Bean
    public DatabaseMigrationServiceCallback b2() {
        return new DatabaseMigrationServiceCallback();
    }
}

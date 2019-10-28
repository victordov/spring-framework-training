package com.endava.internship.s_12_container.config;

import com.endava.internship.s_12_container.domain.timing.DateTimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public DateTimeService dateTimeService() {
        return new DateTimeService();
    }
}

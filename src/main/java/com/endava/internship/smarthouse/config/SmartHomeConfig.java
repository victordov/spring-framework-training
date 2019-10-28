package com.endava.internship.smarthouse.config;

import com.endava.internship.smarthouse.domain.hub.Hub;
import com.endava.internship.smarthouse.domain.hub.MiHub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmartHomeConfig {

    @Bean
    public Hub miHub() {
        return new MiHub();
    }
}

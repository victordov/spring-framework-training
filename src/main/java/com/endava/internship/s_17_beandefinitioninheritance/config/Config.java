package com.endava.internship.s_17_beandefinitioninheritance.config;

import com.endava.internship.s_17_beandefinitioninheritance.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public User testUser() {
        final User user = new User();
        user.setAge(54);
        user.setName("Columbus");
        return user;
    }

    @Bean
    public User inheritUser(@Autowired User testUser) {
        return new User("Christopher", testUser.getAge());
    }
}

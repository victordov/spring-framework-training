package com.endava.internship.s_17_beandefinitioninheritance.runner;

import com.endava.internship.BaseTest;
import com.endava.internship.s_17_beandefinitioninheritance.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@ContextConfiguration(locations = "classpath:com/endava/internship/s_17_beandefinitioninheritance/config/beandefinitioninheritance-context.xml")
class BeanDefinitionInheritanceTest extends BaseTest {

    @Autowired
    List<User> users;

    @Test
    void should_autowireUsers_whenContextIsValid() {
        assertThat(users).isNotEmpty();
    }

}

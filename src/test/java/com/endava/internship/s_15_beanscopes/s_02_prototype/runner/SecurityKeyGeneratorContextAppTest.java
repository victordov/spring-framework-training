package com.endava.internship.s_15_beanscopes.s_02_prototype.runner;

import com.endava.internship.s_15_beanscopes.s_02_prototype.domain.SecurityKeyGenerator;
import com.endava.internship.s_15_beanscopes.s_02_prototype.domain.UserPasswordRegister;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:/com/endava/internship/s_15_beanscopes/s_02_prototype/config/s_02_prototype-context.xml")
class SecurityKeyGeneratorContextAppTest {


    @Autowired
    ApplicationContext context;

    @Autowired
    UserPasswordRegister userPasswordRegister;

    @RepeatedTest(5)
    void should_provideDifferentSeeds() {
        final long seed = context.getBean(SecurityKeyGenerator.class).hashSeed();
        System.out.println(seed);
        assertThat(seed)
            .withFailMessage("Seed should not be 0")
            .isNotZero();
    }

    @RepeatedTest(5)
    public void generateMultipleSeeds() {
        System.out.println(userPasswordRegister.generateSecureKey());
    }
}

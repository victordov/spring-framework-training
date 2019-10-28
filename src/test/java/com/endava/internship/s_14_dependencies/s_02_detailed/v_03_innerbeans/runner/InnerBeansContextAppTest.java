package com.endava.internship.s_14_dependencies.s_02_detailed.v_03_innerbeans.runner;

import com.endava.internship.s_14_dependencies.s_02_detailed.v_03_innerbeans.domain.Inner;
import com.endava.internship.s_14_dependencies.s_02_detailed.v_03_innerbeans.domain.Outer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/com/endava/internship/instantiating_1_4/detailed/v_03_innerbeans/config/v_03_innerbeans-context.xml")
class InnerBeansContextAppTest {

    @Autowired
    ApplicationContext ctx;

    @Test
    void getOuterBeand() {
        final Outer bean = ctx.getBean(Outer.class);
        assertThat(bean).isNotNull();
    }

    @Test
    void should_throwException_when_extractingBeanFromContext() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            final Inner bean = ctx.getBean(Inner.class);
        });
    }

}

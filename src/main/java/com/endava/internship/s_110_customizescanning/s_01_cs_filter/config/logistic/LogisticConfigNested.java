package com.endava.internship.s_110_customizescanning.s_01_cs_filter.config.logistic;

import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.customers.CustomerService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans({
    @ComponentScan(basePackages = "com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.logistics"),
    @ComponentScan(basePackageClasses = CustomerService.class)
})
public class LogisticConfigNested {
}

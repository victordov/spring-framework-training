package com.endava.internship.s_110_customizescanning.s_01_cs_filter.config.logistic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    basePackages = "com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.employees",
    includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
        pattern = "com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.employees.*Service"))
public class LogisticConfigScanRegex {
}

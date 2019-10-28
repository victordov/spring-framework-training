package com.endava.internship.s_110_customizescanning.s_01_cs_filter.config.logistic;

import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.logistics.inventory.LogisticComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = LogisticComponent.class))
public class LogisticConfigScanCustomAnnotation {
}

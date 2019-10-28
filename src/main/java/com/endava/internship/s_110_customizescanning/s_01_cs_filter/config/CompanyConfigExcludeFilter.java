package com.endava.internship.s_110_customizescanning.s_01_cs_filter.config;

import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.customers.CustomerService;
import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.employees.EmployeeService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(
    basePackageClasses = {CustomerService.class, EmployeeService.class},
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class))
public class CompanyConfigExcludeFilter {
}

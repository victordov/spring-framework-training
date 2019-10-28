package com.endava.internship.s_110_customizescanning.application;

import com.endava.internship.BaseTest;
import com.endava.internship.s_110_customizescanning.s_01_cs_filter.config.CompanyConfigExcludeFilter;
import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.customers.CustomerService;
import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.employees.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = CompanyConfigExcludeFilter.class)
class CompanyAppExcludeTest extends BaseTest {

    @Autowired
    CustomerService customerService;

    @Autowired
    EmployeeService employeeService;

    @Test
    void contextLoads() {
        assertThat(customerService).isNotNull();
        assertThat(employeeService).isNotNull();
    }
}

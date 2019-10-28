package com.endava.internship.s_110_customizescanning.s_01_cs_filter.config.logistic;

import com.endava.internship.BaseTest;
import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.customers.CustomerService;
import com.endava.internship.s_110_customizescanning.s_01_cs_filter.domain.users.employees.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = LogisticConfigScanRegex.class)
class LogisticConfigScanRegexTest extends BaseTest {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    CustomerService customerService;

    @Test
    void contextLoads() {
    }

}

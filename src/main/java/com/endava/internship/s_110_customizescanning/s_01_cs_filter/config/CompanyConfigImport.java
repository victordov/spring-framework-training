package com.endava.internship.s_110_customizescanning.s_01_cs_filter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CustomerConfig.class, EmployeeConfig.class})
public class CompanyConfigImport {
}

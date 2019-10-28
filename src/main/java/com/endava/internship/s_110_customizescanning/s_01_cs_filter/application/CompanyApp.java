package com.endava.internship.s_110_customizescanning.s_01_cs_filter.application;

import com.endava.internship.s_110_customizescanning.s_01_cs_filter.config.CompanyConfigImport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CompanyConfigImport.class);
        //fixme: doesn't load
        ctx.containsBean("customerService");
        ctx.containsBean("employeeService");
    }
}

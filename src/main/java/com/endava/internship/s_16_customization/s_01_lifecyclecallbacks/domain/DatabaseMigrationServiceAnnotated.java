package com.endava.internship.s_16_customization.s_01_lifecyclecallbacks.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DatabaseMigrationServiceAnnotated {

    @PostConstruct
    public void init3() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " initializing 3");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " initializing 1");
    }

    @PostConstruct
    public void init2() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " initializing 2");
    }

    @PreDestroy
    public void dispose() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " closing database connection and removing temporary files");
    }
}

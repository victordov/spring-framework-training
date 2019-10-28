package com.endava.internship.s_14_dependencies.s_03_lazyinitialized.domain;

import javax.annotation.PostConstruct;

/**
 * Is created at the same time as the container
 */
public class RegularService {

    @PostConstruct
    public void init() {
        System.out.println("Called initialization callback");
    }
}

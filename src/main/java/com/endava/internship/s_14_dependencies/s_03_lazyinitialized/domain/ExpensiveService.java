package com.endava.internship.s_14_dependencies.s_03_lazyinitialized.domain;

import javax.annotation.PostConstruct;

public class ExpensiveService {

    @PostConstruct
    public void extractDataFromRemoteRepository() throws InterruptedException {
        System.out.println("Extracting data from expensive repository");
        Thread.sleep(5000);
    }

    //TODO: use as a dependency of a singleton
}

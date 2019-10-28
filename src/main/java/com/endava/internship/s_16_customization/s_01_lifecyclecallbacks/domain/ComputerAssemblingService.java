package com.endava.internship.s_16_customization.s_01_lifecyclecallbacks.domain;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ComputerAssemblingService implements SmartLifecycle {

    @Override
    public void stop(Runnable callback) {
        callback.run();
    }

    @Override
    public int getPhase() {
        return Integer.MIN_VALUE;
    }

    @PostConstruct
    void init() {
        System.out.println("init");
    }

    @PreDestroy
    void dispose() {
        System.out.println("dispose");
    }

    @Override
    public void start() {
        System.out.println("starting lifecycle");
    }

    @Override
    public void stop() {
        System.out.println("stoping lifecycle");
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}

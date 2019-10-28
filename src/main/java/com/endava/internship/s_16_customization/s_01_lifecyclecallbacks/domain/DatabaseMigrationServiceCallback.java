package com.endava.internship.s_16_customization.s_01_lifecyclecallbacks.domain;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseMigrationServiceCallback implements InitializingBean, DisposableBean, BeanNameAware {

    @Override
    public void setBeanName(String name) {
        switch (name) {
            case "b1": {
                // init oracle database
                break;
            }
            case "b2": {
                //init mysql database
                break;
            }
            default: {
                // do nothing
            }
        }
        System.out.println("setBeanName: " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " after properties set initializing database state validation");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " closing database connection and removing temporary files");
    }
}

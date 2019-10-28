package com.endava.internship.s_13_beanoverview.runner;

import com.endava.internship.s_13_beanoverview.domain.MusicService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MusicStoreApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
            new ClassPathXmlApplicationContext("com/endava/internship/s_13_beanoverview/config/music-context.xml");

        // default constructor
        context.getBean("playerService", MusicService.class).play();

        //using static factory-method
        context.getBean("playerServiceRadio", MusicService.class).play();

        // using factory-bean
        context.getBean("onlinePlayerService", MusicService.class).play();
        // using factory-bean's second factory method, as per definition we can have multiple ones
        context.getBean("tapeMusicService", MusicService.class).play();
        context.getBean("tapeMusicServiceAlias", MusicService.class).play();
    }
}

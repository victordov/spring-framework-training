package com.endava.internship.s_19_annotationbasedconfiguration.config;


import com.endava.internship.s_19_annotationbasedconfiguration.domain.actor.MovieActor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = {MovieActor.class})
@PropertySource("classpath:movie-actor.properties")
public class MovieActorConfig {

}

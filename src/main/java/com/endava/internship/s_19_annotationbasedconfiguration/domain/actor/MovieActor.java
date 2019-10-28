package com.endava.internship.s_19_annotationbasedconfiguration.domain.actor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieActor {

    private final String actor;

    public MovieActor(@Value("${actor}") String actor) {
        this.actor = actor;
    }

    public String getName() {
        return actor;
    }
}

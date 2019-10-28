package com.endava.internship.s_19_annotationbasedconfiguration.config;

import com.endava.internship.BaseTest;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.actor.MovieActor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = MovieActorConfig.class)
class MovieActorConfigTest extends BaseTest {


    @Autowired
    MovieActor movieActor;

    @Test
    void should_printMovieActorName() {
        Assertions.assertThat(movieActor.getName()).isNotBlank();
    }
}

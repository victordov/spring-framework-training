package com.endava.internship.s_19_annotationbasedconfiguration.runner;

import com.endava.internship.BaseTest;
import com.endava.internship.s_19_annotationbasedconfiguration.config.AnnotationBasedConfiguration;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.finders.MovieListener;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.MovieRecomender;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.Format;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.MovieCatalog;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.MovieQualifier;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = AnnotationBasedConfiguration.class)
class AnnotationBasedAppTest extends BaseTest {


    @Autowired
    MovieListener listener;

    @Autowired
    MovieRecomender recommender;

    @Test
    void contextLoads() {

    }

    @Test
    void should_loadMovieCatalog() {
        System.out.println(recommender);
    }

    //Multiple candidates,
//    @Autowired
//    MovieCatalog movieCatalog;

//    @Autowired
//    @Qualifier("freeCatalog")
//    MovieCatalog movieCatalog;

//    @Autowired
//    @FreeCatalog
//    MovieCatalog movieCatalog;

    @Autowired
    @MovieQualifier(format = Format.BLURAY)
    MovieCatalog movieCatalog;
}

package com.endava.internship.s_19_annotationbasedconfiguration.config;


import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.Format;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.MovieCatalog;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.MovieQualifier;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs.MovieRecomender;
import com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.finders.MovieListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {MovieListener.class, MovieRecomender.class})
public class AnnotationBasedConfiguration {

    @Bean
//    @Primary
    public MovieCatalog freeCatalog() {
        return new MovieCatalog();
    }

    @Bean
    public MovieCatalog paidCatalog() {
        return new MovieCatalog();
    }

    @Bean
    @MovieQualifier(format = Format.BLURAY)
    public MovieCatalog vhsCatalog() {
        final MovieCatalog catalog = new MovieCatalog();
        catalog.setFormat(Format.BLURAY);
        return catalog;
    }
}

package com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MovieRecomender {

    @Autowired
    private MovieCatalog[] catalogs;

    // another option to set movie catalogs
//    @Autowired
//    public void setCatalogs(MovieCatalog[] catalogs) {
//        this.catalogs = catalogs;
//    }


    @Autowired
    public void prepareMoviesCatalogs(@Qualifier("freeCatalog") MovieCatalog catalog) {

    }

    @Override
    public String toString() {
        return "MovieRecomender{" +
            "catalogs=" + Arrays.toString(catalogs) +
            '}';
    }
}

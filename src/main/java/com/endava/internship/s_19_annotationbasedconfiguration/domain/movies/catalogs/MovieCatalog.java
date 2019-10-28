package com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.catalogs;

public class MovieCatalog {

    Format format;

    public Format getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "MovieCatalog{}";
    }

    public void setFormat(Format format) {
        this.format = format;
    }
}

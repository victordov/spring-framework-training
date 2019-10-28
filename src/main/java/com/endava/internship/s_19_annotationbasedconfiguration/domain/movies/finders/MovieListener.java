package com.endava.internship.s_19_annotationbasedconfiguration.domain.movies.finders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import javax.annotation.Resource;

@Component
public class MovieListener {

    private MovieFinder movieFinder;
    private MovieSubtitlesFinder movieSubtitlesFinder;

    @Autowired
    private MovieReviewFinder movieReviewFinder;

    // Only one constructor can use @Autowired with required set to true
    @Autowired
    public MovieListener(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Autowired(required = false)
    public void setMovieSubtitlesFinder(MovieSubtitlesFinder movieSubtitlesFinder) {
        this.movieSubtitlesFinder = movieSubtitlesFinder;
    }

    @Autowired
    public void setMovieSubtitlesFinderOptional(Optional<MovieSubtitlesFinder> movieSubtitlesFinder) {
        movieSubtitlesFinder.ifPresent(movieSubtitlesFinderEl -> this.movieSubtitlesFinder = movieSubtitlesFinderEl);
    }

    @Autowired
    public void setMovieSubtitlesFinderNullable(@Nullable MovieSubtitlesFinder movieSubtitlesFinder) {
        this.movieSubtitlesFinder = movieSubtitlesFinder;
    }

    @Resource
    public void setMovieSubtitlesFinderResource(MovieSubtitlesFinder movieSubtitlesFinder) {
        this.movieSubtitlesFinder = movieSubtitlesFinder;
    }
}

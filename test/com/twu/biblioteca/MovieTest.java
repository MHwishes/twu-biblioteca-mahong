package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieTest {

    @Test
    public void should_get_detail_for_book() {
        Movie movie = new Movie("movie","2015","zhangdab","2");

        assertThat(movie.getMovieDetail(),containsString("movie"));
        assertThat(movie.getMovieDetail(),containsString("2015"));
        assertThat(movie.getMovieDetail(), containsString("zhangdab"));
        assertThat(movie.getMovieDetail(), containsString("2"));
    }
}

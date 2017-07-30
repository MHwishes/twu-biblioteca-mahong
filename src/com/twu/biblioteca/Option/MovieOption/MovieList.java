package com.twu.biblioteca.Option.MovieOption;


import com.twu.biblioteca.Library;
import com.twu.biblioteca.MenuOption;

public class MovieList implements MenuOption {
    private Library library;

    public MovieList(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.displayMovies();
    }
}

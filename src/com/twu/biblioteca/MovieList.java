package com.twu.biblioteca;


public class MovieList implements MenuOption{
    private Library library;

    MovieList(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.displayMovies();
    }
}

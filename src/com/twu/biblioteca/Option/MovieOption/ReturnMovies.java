package com.twu.biblioteca.Option.MovieOption;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.MenuOption;

public class ReturnMovies implements MenuOption {
    private Library library;
    private Console console;

    public ReturnMovies(Library library, Console console) {
        this.library = library;
        this.console = console;
    }

    @Override
    public void execute() {
        library.displayCheckedOutMoviesWithNumbers();
        System.out.print("Choose a move: ");

        String n = console.getUserInput();

        if (library.returnMovie(Integer.parseInt(n))) {
            System.out.println("Thank you for returning the movie.");
        } else {
            System.out.println("That is not a valid movie to return.");
            System.out.print("Please re-enter a valid movie choice: ");
        }
    }
}

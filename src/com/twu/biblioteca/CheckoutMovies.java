package com.twu.biblioteca;

public class CheckoutMovies implements MenuOption{
    private Library library;
    private Console console;

    CheckoutMovies(Library library,Console console) {
        this.library = library;
        this.console=console;
    }

    @Override
    public void execute() {
        library.displayMoviesWithNumbers();
        System.out.print("Choose a movie: ");

        String n=console.getUserInput();

        if(library.checkoutMovie(Integer.parseInt(n))) {
            System.out.println("Thank you! Enjoy your movie.");
        } else {
            System.out.println("That movie is not available.");
            System.out.print("Please re-enter a valid movie choice: ");
        }
    }
}
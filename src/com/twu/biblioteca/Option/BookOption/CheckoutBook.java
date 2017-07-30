package com.twu.biblioteca.Option.BookOption;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.MenuOption;

public class CheckoutBook implements MenuOption {
    private Library library;
    private Console console;

    public CheckoutBook(Library library, Console console) {
        this.library = library;
        this.console = console;
    }

    @Override
    public void execute() {
        library.displayBooksWithNumbers();
        System.out.print("Choose a book: ");

        String n = console.getUserInput();

        if (library.checkoutBook(Integer.parseInt(n))) {
            System.out.println("Thank you! Enjoy your book.");
        } else {
            System.out.println("That book is not available.");
            System.out.print("Please re-enter a valid book choice: ");
        }
    }
}

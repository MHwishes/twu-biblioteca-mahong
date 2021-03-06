package com.twu.biblioteca.option.bookOption;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.MenuOption;

public class ReturnBook implements MenuOption {
    private Library library;
    private Console console;

    public ReturnBook(Library library, Console console) {
        this.library = library;
        this.console = console;
    }

    @Override
    public void execute() {
        library.displayCheckedOutBooksWithNumbers();
        System.out.print("Choose a book: ");

        String n = console.getUserInput();

        if (library.returnBook(Integer.parseInt(n))) {
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("That is not a valid book to return.");
            System.out.print("Please re-enter a valid book choice: ");
        }
    }
}

package com.twu.biblioteca;

public class CheckoutBook implements MenuOption {
    private Library library;
    private Console console;

     CheckoutBook(Library library,Console console) {
        this.library = library;
        this.console=console;
    }

    @Override
    public void execute() {
       library.displayBooksWithNumbers();
        System.out.print("Choose a book: ");

        String n=console.getUserInput();

        if(library.checkoutBook(Integer.parseInt(n))) {
            System.out.println("Thank you! Enjoy your book.");
        } else {
            System.out.println("That book is not available.");
            System.out.print("Please re-enter a valid book choice: ");
        }
    }
}

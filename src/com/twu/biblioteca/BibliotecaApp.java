package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {

        Map<String, MenuOption> menuOptions = new HashMap<String, MenuOption>();

        Library library = library();
        Console console = new Console();

        menuOptions.put("1",new BookList(library));
        menuOptions.put("2",new CheckoutBook(library,console));
        menuOptions.put("3",new ReturnBook(library,console));
        new Application(menuOptions,console).start();
    }



    private static Library library() {
        List<Book> listOfBooks = new ArrayList<Book>();
        Book book1 = new Book("The Dispossessed", "Ursula K. Le Guin", "2001");
        Book book2 = new Book("Island", "Aldous Huxley", "1953");
        listOfBooks.add(book1);
        listOfBooks.add(book2);


        List<Book> checkoutOfBooks = new ArrayList<Book>();
        Book checkedOutBook1 = new Book("The Name of the Wind", "Patrick Rothfuss", "2006");
        Book checkedOutBook2 = new Book("Wise Man's Fear", "Patrick Rothfuss", "2010");
        checkoutOfBooks.add(checkedOutBook1);
        checkoutOfBooks.add(checkedOutBook2);

        return new Library(listOfBooks,checkoutOfBooks);


    }
}

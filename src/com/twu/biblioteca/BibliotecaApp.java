package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {

        Map<String, MenuOption> menuOptions = new HashMap<String, MenuOption>();
        Library library = library();
        menuOptions.put("1",new BookList(library));


        Console console = new Console();


        new Application(menuOptions,console,library()).start();
    }



    private static Library library() {
        List<Book> listOfBooks = new ArrayList<Book>();
        Book book1 = new Book("The Dispossessed", "Ursula K. Le Guin", "2001");
        Book book2 = new Book("Island", "Aldous Huxley", "1953");
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        return new Library(listOfBooks);
    }
}

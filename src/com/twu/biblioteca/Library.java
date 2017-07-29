package com.twu.biblioteca;


import java.util.List;

public class Library {
    private List<Book> bookList;

    Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void displayBooks() {
        for (Book book : bookList) {
            System.out.println(book.getDetails());
        }
    }

}

package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String publishDate;

    public Book(String title, String author, String publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getDetails() {

        return String.format("%-30s %-30s %-4s", title, author, publishDate);
    }
}

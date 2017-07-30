package com.twu.biblioteca;


import java.util.List;

public class Library {
    private List<Book> bookList;
    private List<Book> booksCheckedOut;
    private List<Movie> movieList;
    private List<Movie> movieCheckedOut;


    public Library(List<Book> bookList, List<Book> booksCheckedOut,List<Movie> movieList, List<Movie> movieCheckedOut) {
        this.bookList = bookList;
        this.booksCheckedOut = booksCheckedOut;
        this.movieCheckedOut = movieCheckedOut;
        this.movieList = movieList;
    }


    public void displayBooks() {
        for (Book book : bookList) {
            System.out.println(book.getDetails());
        }
    }

    public void displayMovies() {
        for (Movie movie : movieList) {
            System.out.println(movie.getMovieDetail());
        }
    }

    public void displayBooksWithNumbers() {
        for (int i = 1; i <= bookList.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(bookList.get(i - 1).getDetails());
        }

    }

    public void displayCheckedOutBooksWithNumbers() {
        for (int i = 1; i <= booksCheckedOut.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(booksCheckedOut.get(i - 1).getDetails());
        }

    }

    public Boolean checkoutBook(Integer bookIndex) {
        int index = bookIndex - 1;
        if (index >= 0 && index < bookList.size()) {
            Book book = bookList.remove(index);
            booksCheckedOut.add(book);
            return true;
        }
        return false;
    }


    public Boolean returnBook(Integer bookIndex) {
        int index = bookIndex - 1;
        if (index >= 0 && index < booksCheckedOut.size()) {
            Book book = booksCheckedOut.remove(index);
            bookList.add(book);
            return true;
        }
        return false;

    }
}

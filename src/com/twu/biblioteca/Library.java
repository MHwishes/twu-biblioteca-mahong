package com.twu.biblioteca;


import com.twu.biblioteca.bean.Book;
import com.twu.biblioteca.bean.Movie;
import com.twu.biblioteca.bean.User;

import java.util.List;

public class Library {
    private List<Book> bookList;
    private List<Book> booksCheckedOut;
    private List<Movie> movieList;
    private List<Movie> movieCheckedOut;
    private List<User> users;


    public Library(List<Book> bookList, List<Book> booksCheckedOut,List<Movie> movieList, List<Movie> movieCheckedOut,List<User> users) {
        this.bookList = bookList;
        this.booksCheckedOut = booksCheckedOut;
        this.movieCheckedOut = movieCheckedOut;
        this.movieList = movieList;
        this.users=users;
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

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user.getUserDetail());
        }
    }

    public void displayBooksWithNumbers() {
        for (int i = 1; i <= bookList.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(bookList.get(i - 1).getDetails());
        }

    }

    public void displayMoviesWithNumbers() {
        for (int i = 1; i <= movieList.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(movieList.get(i - 1).getMovieDetail());
        }

    }



    public void displayCheckedOutBooksWithNumbers() {
        for (int i = 1; i <= booksCheckedOut.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(booksCheckedOut.get(i - 1).getDetails());
        }

    }

    public void displayCheckedOutMoviesWithNumbers() {
        for (int i = 1; i <= movieCheckedOut.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(movieCheckedOut.get(i - 1).getMovieDetail());
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

    public Boolean checkoutMovie(Integer movieIndex) {
        int index = movieIndex - 1;
        if (index >= 0 && index < movieList.size()) {
            Movie movie = movieList.remove(index);
            movieCheckedOut.add(movie);
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
    public Boolean returnMovie(Integer movieIndex) {
        int index = movieIndex - 1;
        if (index >= 0 && index < movieCheckedOut.size()) {
            Movie movie = movieCheckedOut.remove(index);
            movieList.add(movie);
            return true;
        }
        return false;

    }

}

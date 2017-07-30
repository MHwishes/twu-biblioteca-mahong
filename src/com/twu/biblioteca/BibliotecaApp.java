package com.twu.biblioteca;

import com.twu.biblioteca.Option.BookOption.BookList;
import com.twu.biblioteca.Option.BookOption.CheckoutBook;
import com.twu.biblioteca.Option.BookOption.ReturnBook;
import com.twu.biblioteca.Option.MovieOption.CheckoutMovies;
import com.twu.biblioteca.Option.MovieOption.MovieList;
import com.twu.biblioteca.Option.MovieOption.ReturnMovies;
import com.twu.biblioteca.Option.UserOption.UserList;
import com.twu.biblioteca.bean.Book;
import com.twu.biblioteca.bean.Movie;
import com.twu.biblioteca.bean.User;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {

        Map<String, MenuOption> menuOptions = new HashMap<String, MenuOption>();

        Library library = library();
        Console console = new Console();

        menuOptions.put("1",new BookList(library));
        menuOptions.put("2",new CheckoutBook(library,console));
        menuOptions.put("3",new ReturnBook(library,console));
        menuOptions.put("4",new MovieList(library));
        menuOptions.put("5",new CheckoutMovies(library,console));
        menuOptions.put("6",new ReturnMovies(library,console));
        menuOptions.put("7",new UserList(library));
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

        List<Movie> listOfMovie = new ArrayList<Movie>();
        Movie movie1 = new Movie("yuyuyu", "2017", "zhang","6");
        Movie movie2 = new Movie("ccccc", "2019", "zhang2","6");
        listOfMovie.add(movie1);
        listOfMovie.add(movie2);

        List<Movie> checkoutOfMovies = new ArrayList<Movie>();
        Movie checkedOutMove1 = new Movie("wind", "2016", "ma","7");
        Movie checkedOutMove2 = new Movie("rain", "2017", "zhao","10");
        checkoutOfMovies.add(checkedOutMove1);
        checkoutOfMovies.add(checkedOutMove2);

        List<User> users = new ArrayList<User>();
        User user1 = new User("ma", "10253831432qq.com", "18829290322","123456","0001");
        users.add(user1);

        return new Library(listOfBooks,checkoutOfBooks,listOfMovie,checkoutOfMovies,users);

    }
}

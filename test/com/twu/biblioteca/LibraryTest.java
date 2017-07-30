package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    private List<Book> bookList;
    private List<Book> booksCheckedOut;
    private Book book1;
    private Book checkedOutBook1;
    private Library myLibrary;

    @Before
    public void setup(){
        bookList = new ArrayList<Book>();
        book1 = mock(Book.class);
        bookList.add(book1);

        booksCheckedOut = new ArrayList<Book>();
        checkedOutBook1 = mock(Book.class);
        booksCheckedOut.add(checkedOutBook1);

        myLibrary = new Library(bookList, booksCheckedOut );
    }

    @Test
    public void shouldPrintOneBookWhenLibraryHasOneBook() {

        myLibrary.displayBooks();

        verify(book1).getDetails();
    }

    @Test
    public void shouldPrintBooksWhenLibraryHasMultipleBooks(){
        Book book2 = mock(Book.class);
        bookList.add(book2);

        myLibrary.displayBooks();

        verifyBookListPrinted(bookList);
    }

    private void verifyBookListPrinted(List<Book> books) {
        for (Book book : books) {
            verify(book).getDetails();
        }
    }
    @Test
    public void shouldReturnFalseWhenInvalidBookCheckedOut() {
        Book book2 = mock(Book.class);
        bookList.add(book2);

        boolean checkedOut = myLibrary.checkoutBook(10);

        assertEquals(checkedOut, false);
        assertEquals(bookList.size(), 2);

    }

    @Test
    public void shouldReturnTrueWhenReturningValidBook() {
        boolean returnedBook = myLibrary.returnBook(1);
        assertEquals(returnedBook, true);
    }

    @Test
    public void shouldDecreaseCheckedOutBooksByOneWhenReturningValidBook() {
        myLibrary.returnBook(1);
        assertEquals(bookList.size(), 2);
        assertEquals(booksCheckedOut.size(), 0);
    }
}

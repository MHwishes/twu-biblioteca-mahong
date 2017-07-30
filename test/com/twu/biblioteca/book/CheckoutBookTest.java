package com.twu.biblioteca.book;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.Option.BookOption.CheckoutBook;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;

public class CheckoutBookTest {

    private Library library;
    private CheckoutBook checkoutBook;
    private Console console;

    @Before
    public void setUp() throws Exception {
        library = mock(Library.class);
        console = mock(Console.class);
        checkoutBook = new CheckoutBook(library,console);
        when(console.getUserInput()).thenReturn("1");
    }


    @Test
    public void shouldCheckoutBookFromLibrary() {
        checkoutBook.execute();
        verify(library).checkoutBook(1);
    }

    @Test
    public void shouldGetInputFromConsoleOnExecute() {
        checkoutBook.execute();
        verify(console).getUserInput();
    }

}

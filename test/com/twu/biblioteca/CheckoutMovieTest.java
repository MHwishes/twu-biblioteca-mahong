package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckoutMovieTest {
    private Library library;
    private CheckoutMovies checkoutMovies;
    private Console console;

    @Before
    public void setUp() throws Exception {
        library = mock(Library.class);
        console = mock(Console.class);
        checkoutMovies = new CheckoutMovies(library,console);
        when(console.getUserInput()).thenReturn("1");
    }


    @Test
    public void shouldCheckoutMoviesFromLibrary() {
        checkoutMovies.execute();
        verify(library).checkoutMovie(1);
    }

    @Test
    public void shouldGetInputFromConsoleOnExecute() {
        checkoutMovies.execute();
        verify(console).getUserInput();
    }

}

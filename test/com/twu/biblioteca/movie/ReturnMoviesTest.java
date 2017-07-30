package com.twu.biblioteca.movie;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.option.movieOption.ReturnMovies;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ReturnMoviesTest {
    private Library library;
    private Console console;
    private ReturnMovies returnMovies;

    @Before
    public void setUp() throws Exception {
        library = mock(Library.class);
        console = mock(Console.class);
        returnMovies = new ReturnMovies(library, console);

        when(console.getUserInput()).thenReturn("1");
    }

    @Test
    public void shouldDisplayCheckedOutMoviesOnExecute() {
        returnMovies.execute();

        verify(library).displayCheckedOutMoviesWithNumbers();
    }


    @Test
    public void shouldGetInputFromConsoleOnExecute() {
        returnMovies.execute();

        verify(console).getUserInput();
    }


    @Test
    public void shouldReturnMovie1WhenExecuteCalledWithInput1(){
        returnMovies.execute();

        verify(library).returnMovie(1);
    }

}

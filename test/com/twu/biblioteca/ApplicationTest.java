package com.twu.biblioteca;

import com.twu.biblioteca.Option.BookOption.BookList;
import com.twu.biblioteca.Option.BookOption.CheckoutBook;
import com.twu.biblioteca.Option.BookOption.ReturnBook;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ApplicationTest {

    private Library library;
    private Application application;
    private Console console;
    private BookList listBookOption;
    private CheckoutBook checkoutBookOption;
    private Map<String, MenuOption> menu;
    private ReturnBook returnBookOption;

    @Before
    public void setUp() throws Exception {
        library = mock(Library.class);
        console = mock(Console.class);
        listBookOption = mock(BookList.class);
        checkoutBookOption = mock(CheckoutBook.class);
        returnBookOption = mock(ReturnBook.class);
        menu = new HashMap<String, MenuOption>();
        menu.put("1", listBookOption);
        menu.put("2", checkoutBookOption);
        menu.put("3", returnBookOption);

        application = new Application(menu,console);

        when(console.getUserInput()).thenReturn("1").thenReturn("4");
    }


    @Test
    public void shouldWelcomeUserWhenStarting(){
        application.start();
        verify(console).displayWelcomeInfo();
    }

    @Test
    public void shouldGetUserInput(){
        when(console.getUserInput()).thenReturn("4");

        application.start();

        verify(console).getUserInput();
    }

    @Test
    public void shouldCheckoutBook() {
        when(console.getUserInput()).thenReturn("2").thenReturn("1").thenReturn("4");

        application.start();

        verify(checkoutBookOption).execute();
    }

    @Test
    public void shouldReturnBook() {
        when(console.getUserInput()).thenReturn("3").thenReturn("1").thenReturn("4");

        application.start();

        verify(returnBookOption).execute();
    }
}

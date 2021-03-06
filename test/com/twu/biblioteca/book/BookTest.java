package com.twu.biblioteca.book;


import com.twu.biblioteca.bean.Book;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;


public class BookTest {
    @Test
    public void should_get_detail_for_book() {
        Book book = new Book("Book Name", "Book Author", "2000");

        assertThat(book.getDetails(),containsString("Book Name"));
        assertThat(book.getDetails(),containsString("Book Author"));
        assertThat(book.getDetails(), containsString("2000"));

    }

}

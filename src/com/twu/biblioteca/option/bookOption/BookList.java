package com.twu.biblioteca.option.bookOption;

import com.twu.biblioteca.Library;
import com.twu.biblioteca.MenuOption;

public class BookList implements MenuOption {

    private Library library;

    public BookList(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.displayBooks();
    }

}

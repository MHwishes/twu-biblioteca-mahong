package com.twu.biblioteca;

public class BookList  implements MenuOption{

    private Library library;

     BookList(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.displayBooks();
    }

}

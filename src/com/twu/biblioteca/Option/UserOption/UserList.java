package com.twu.biblioteca.Option.UserOption;

import com.twu.biblioteca.Library;
import com.twu.biblioteca.MenuOption;

public class UserList implements MenuOption {
    private Library library;

    public UserList(Library library) {
        this.library = library;

    }

    @Override
    public void execute() {
        library.displayUsers();
    }

}

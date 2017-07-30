package com.twu.biblioteca;

public class UserList implements MenuOption{
    private  Library library;
    UserList(Library library){
        this.library=library;

    }
    @Override
    public  void execute(){
        library.displayUsers();
    }

}

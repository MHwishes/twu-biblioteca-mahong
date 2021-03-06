package com.twu.biblioteca.bean;


public class User {
    private String libraryNumber;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public User(String name, String email, String phoneNumber, String password, String libraryNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.libraryNumber = libraryNumber;

    }

    public User(String password, String libraryNumber) {
        this.password = password;
        this.libraryNumber = libraryNumber;
    }

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserDetail() {
        return String.format("%s\t%s\t%s\n", name, email, phoneNumber);
    }

    public String getUserLoginInfo() {
        return String.format("%s\t%s\t", libraryNumber, password);
    }

}

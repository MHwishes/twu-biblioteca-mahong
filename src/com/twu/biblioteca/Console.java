package com.twu.biblioteca;


public class Console {

    void displayWelcomeInfo(){
        System.out.println("Hello,Welcome! ");
    }

    void disPlayMenu(){
        System.out.println();
        System.out.println("1. List books");
        System.out.println("2. Checkout book");
        System.out.println("3. Return book");
        System.out.println("4. Quit");
        System.out.println();
        System.out.print("Enter option number: ");
    }
}

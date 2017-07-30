package com.twu.biblioteca;
import java.util.Scanner;

public class Console {

    void displayWelcomeInfo() {
        System.out.println("Hello,Welcome! ");
    }

    public String getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    void disPlayMenu() {
        System.out.println();
        System.out.println("1. List books");
        System.out.println("2. Checkout book");
        System.out.println("3. Return book");
        System.out.println("4. Quit");
        System.out.println();
    }
}

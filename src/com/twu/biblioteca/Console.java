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
        System.out.println("4. List Movies");
        System.out.println("5. checkout Movie");
        System.out.println("6. return  movie");
        System.out.println("7. list users");
        System.out.println("8. Quit");
        System.out.println();
    }

    public Boolean isSuccessfulLogin() {
        System.out.print("\nplease input library Number:");
        String libraryNumber = getUserInput();
        System.out.print("\nplease input password:");
        String password = getUserInput();

        if (libraryNumber.equals("0001") && password.equals("123456")) {
            return true;
        } else {
            System.out.print("library Number or password wrong,please input again:");
            return false;
        }


    }
}

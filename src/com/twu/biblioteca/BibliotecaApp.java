package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Map<String, MenuOption> menuOptions = new HashMap<String, MenuOption>();
//        Console console = new Console();
//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print("hrllp");

        Console console = new Console();

        new Application(menuOptions,console).start();
    }
}

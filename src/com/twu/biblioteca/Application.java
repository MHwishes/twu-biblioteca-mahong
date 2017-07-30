package com.twu.biblioteca;

import java.util.Map;
import java.util.Scanner;

public class Application {
    private Library library;
    private Console console;
    private Map<String, MenuOption> menu;

    public Application(Map<String, MenuOption> menu, Console console) {
        this.console = console;
        this.menu = menu;
    }

    public void start() {
        console.displayWelcomeInfo();
        System.out.println("*******************************************************************");
        console.disPlayMenu();
        System.out.println("*******************************************************************");
        System.out.print("Enter option number: ");
        String n = console.getUserInput();

        while (!n.equals("4")) {

            if (menu.containsKey(n)) {

                menu.get(n).execute();
            } else {
                System.out.println("Select a valid option!");
            }
            console.disPlayMenu();
            n = console.getUserInput();
        }
    }


}

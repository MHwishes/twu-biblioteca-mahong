package com.twu.biblioteca;

import java.util.Map;

public class Application {
    private Library library;
    private Console console;
    private Map<String, MenuOption> menu;

    public Application(Map<String, MenuOption> menu, Console console) {
        this.console = console;
        this.menu = menu;
    }

    public void start() {
        while (true) {
            if (console.isSuccessfulLogin()) {
                console.displayWelcomeInfo();
                System.out.println("*******************************************************************");
                console.disPlayMenu();
                System.out.println("*******************************************************************");
                System.out.print("Enter option number: ");
                String n = console.getUserInput();

                while (true) {
                    if (n.equals("7")) {
                        System.exit(-1);
                    }
                    if (menu.containsKey(n)) {

                        menu.get(n).execute();
                    } else {
                        System.out.println("Select a valid option!");
                    }
                    console.disPlayMenu();
                    n = console.getUserInput();
                }
            } else {
                console.isSuccessfulLogin();
            }
        }
    }


}

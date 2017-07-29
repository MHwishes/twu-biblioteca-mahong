package com.twu.biblioteca;

import java.util.Map;
import java.util.Scanner;

public class Application {
   private Library library;
   private Console console;
   private Map<String, MenuOption> menu;

   public Application(){

   }
    public Application(Map<String, MenuOption> menu, Console console,Library library) {
//        this.library = library;
        this.console = console;
        this.menu = menu;
    }

    public void start() {
        console.displayWelcomeInfo();
        console.disPlayMenu();

        Scanner sc = new Scanner(System.in);
        String n = sc.next();

      while(!n.equals("4")){

          System.out.print(menu.containsKey(n)+"ooooo");
          if (menu.containsKey(n)) {

              menu.get(n).execute();
          } else {
              System.out.println("Select a valid option!");
          }
          console.disPlayMenu();

           sc = new Scanner(System.in);
           n = sc.next();
      }
    }


}

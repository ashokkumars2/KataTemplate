package com.elsevier.kata;

import java.util.Scanner;

public class Application {

  public static void main(String args[]) {
    GetUserInput();
  }

  private static void GetUserInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" What do you want to do? Select the corresponding number");
    System.out.println(" 1. Add new Item \n 2. Remove items \n 3.  View the items");
    if (scanner.hasNext()) {
      String input = scanner.nextLine();
      switch (input){
        case "1" -> readListOfItems();
      }
    }
  }

  private static void readListOfItems() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many items do you want to add? Please provide a valid number");
    if (scanner.hasNext()) {
      int input = Integer.parseInt(scanner.nextLine());
      
    }

  }
}

package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println(getInputFromScanner());
  }

  public static String getInputFromScanner() {

    int summ = 0;
    Scanner scanner = new Scanner(System.in);
    for (int counter = 1; counter < 6; counter++) {
      try {
        System.out.println("please enter number #" + counter);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 0) {
          summ += num;
        } else {
          throw new IllegalArgumentException("negative values not allowed!!! Try again");
          //System.out.println("negative values not allowed!!! Try again.");
        }
      } catch (Exception badUserData) {
        // badUserData.printStackTrace();
        System.out.println("positive number required!!! Try again.");
        System.out.println(badUserData.getMessage());
        counter--;
      }
    }

    return "so sum of your numbers is " + summ;
  }
}



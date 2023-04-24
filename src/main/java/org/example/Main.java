package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getInputFromScanner());
    }

        public static String getInputFromScanner(){

            int summ = 0;
            Scanner scanner = new Scanner(System.in);
            int counter = 1;
            while (counter < 6) {
                    try {
                        System.out.println("please enter number #" + counter);
                        int num = Integer.parseInt(scanner.nextLine());
                        if (num > 0) {
                            summ += num;
                            counter++;
                        }
                    } catch (NumberFormatException badUserData) {
                        System.out.println("Characters not allowed!!! Try again.");
                    }
            }

        return "so sum of your numbers is " + summ;
    }
    }



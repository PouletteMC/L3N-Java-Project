package org.example;

import java.util.Scanner;

/**
 * @author Poulette
 * @version 0.5
 */

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello World!");
                System.out.println("What is your name?");
                String name = sc.nextLine();
                System.out.println("Hello " + name + "!");
                sc.close();
        }
}
package org.example;

import org.example.Buildings.*;

import java.util.Scanner;

/**
 * @author Poulette
 * @version 0.5
 */

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello, welcome to Mele-Mele!");
                System.out.println("We will create 3 towers for you.");
                System.out.println("What should we name the first tower?");
                String tower1Name = sc.nextLine();
                System.out.println("The first tower will be called " + tower1Name + ".");
                System.out.println("What should the address be?");
                String tower1Address = sc.nextLine();
                System.out.println("The address will be " + tower1Address + ".");
                System.out.println("How many elevators should the tower have?");
                int tower1Elevators;
                boolean accepted = false;
                do {
                        while (!sc.hasNextInt()) {
                                System.out.println("That's not a number!");
                                sc.next();
                        }
                        tower1Elevators = sc.nextInt();
                        if (tower1Elevators < 0) {
                                System.out.println("The number of elevators cannot be negative!");
                        } else {
                                System.out.println("The tower will have " + tower1Elevators + " elevators.");
                                break;
                        }
                } while (true);

                int tower1Offices;
                do {
                        System.out.println("How many offices should the tower have?");
                        while (!sc.hasNextInt()) {
                                System.out.println("That's not a number!");
                                sc.next();
                        }
                        tower1Offices = sc.nextInt();
                        if (tower1Offices < 0) {
                                System.out.println("The number of offices cannot be negative!");
                        } else {
                                System.out.println("The tower will have " + tower1Offices + " offices.");
                                break;
                        }
                } while (true);

                int tower1Apartments = 10;
                int tower1Area = 1000;

                Tower tower1 = new Tower(tower1Name, tower1Elevators, tower1Apartments, tower1Offices, tower1Area, tower1Address);
                System.out.println(tower1);
                sc.close();
        }


        public static boolean isValidInt(int number) {
                if (number > 0) {
                        return true;
                } else {
                        return false;
                }
        }
}

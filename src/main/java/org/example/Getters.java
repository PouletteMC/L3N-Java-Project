package org.example;

import java.util.Arrays;

public class Getters {
    /**
     * @param message The message to display
     * @param min The minimum value
     * @param max The maximum value
     * @return The number entered by the user
     */
    static int getNumber(String message, int min, int max) {
        int number;
        message = message + " (" + min + "-" + max + ")";
        do {
            System.out.println(message);
            while (!Main.scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("\033[H\033[2J");
                System.out.println(message);
                Main.scanner.next();
            }
            number = Main.scanner.nextInt();
            // If the number is outside the range, tell the range and ask again
            if (number < min || number > max) {
                System.out.println("The number must be between " + min + " and " + max + ".");
            }
        } while ( number > max || number < min);
        return number;
    }
    /**
     * @param message The message to display
     * @return The string entered by the user
     */
    static String getString(String message) {
        String string;
        do {
            System.out.println(message);
            while (!Main.scanner.hasNext()) {
                System.out.println("This value must be a string.");
                System.out.println("\033[H\033[2J");
                System.out.println(message);
                Main.scanner.next();
            }
            string = Main.scanner.next();
        } while ( string == null);
        return string;
    }
    /**
     * @param message The message to display
     * @param options The options to choose from
     * @return The string chosen by the user
     */
    static String getStringWithOptions(String message, String[] options) {
        String string;
        message = message + " (" + String.join(", ", options) + ")";
        do {
            System.out.println(message);
            while (!Main.scanner.hasNext()) {
                System.out.println("This value must be a string.");
                System.out.println("\033[H\033[2J");
                System.out.println(message);
                Main.scanner.next();
            }
            string = Main.scanner.next();
        } while ( string == null || !Arrays.asList(options).contains(string));
        return string;
    }
}

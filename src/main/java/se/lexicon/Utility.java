package se.lexicon;

import java.util.Scanner;

/**
 * Utility
 * This class provides helper methods for handling user input and input validation.
 * Includes methods to validate integer menu options and numerical values from the user.
 */
public class Utility {

    /** Scanner instance used to read input from the console */
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * Validates integer input for menu options.
     * Ensures that the user enters an integer within the specified range [min, max].
     * If the input is invalid (non-integer or out of range), prompts the user again.
     *
     * @param min minimum allowed integer value
     * @param max maximum allowed integer value
     * @return validated integer input from the user
     */
    public static int validateOption(int min, int max){
        int option;
        while (true){
            try {
                option = scanner.nextInt();
                // Check if the input is within the allowed range
                if (option < min || option > max){
                    throw new IllegalArgumentException();
                }
                break; // valid input, exit loop
            }catch (Exception e){
                scanner.nextLine(); // clear invalid input from buffer
                System.out.print("Invalid value! Please enter a valid number (" + min + "-" + max + "): ");
            }
        }
        return option;
    }

    /**
     * Validates numerical (double) input from the user.
     * Prompts the user until a valid double value is entered.
     * The method uses the fromUnit string to display context-specific messages.
     *
     * @param fromUnit the unit for which the value is being entered (used in prompt)
     * @return validated double input from the user
     */
    public static double validateDouble(String fromUnit) {
        while (!scanner.hasNextDouble()) {
            IO.print("Invalid input. Please enter a valid value for " + fromUnit + ": ");
            scanner.next(); // discard invalid input
        }
        return scanner.nextDouble();
    }
}
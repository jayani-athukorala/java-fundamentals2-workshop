package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static se.lexicon.Converter.*;
import static se.lexicon.ConverterTool.converters;

/**
 * Main
 * Entry point for the Converter App.
 * Responsibilities:
 *  - Display the main menu with all available converters.
 *  - Handle user selection and call appropriate conversion methods.
 *  - Manage sub-menus for repeated conversions, returning to main menu, or exiting.
 *  - Display conversion results along with the current date and time.
 */
public class Main {

    /**
     * Main loop of the converter application.
     * Continuously displays the main menu until the user chooses to exit.
     */
    static void main() {
        boolean running = true;

        while (running) {
            // Display the main menu and get user's choice
            int converterOption = displayMainMenu();

            // Exit option
            if (converterOption == converters.length + 3) {
                IO.println("Exiting the converter....\nThank you. Come Again!");
                break;
            }

            // Handle selected converter
            running = handleConverter(converterOption);
        }
    }

    /**
     * Displays the main menu with all converters, BMI calculator, grade converter, and exit option.
     *
     * @return user's menu selection (integer)
     */
    static int displayMainMenu() {
        IO.println("============= Converter App Menu ==============");

        for (int i = 0; i < converters.length; i++) {
            IO.println((i + 1) + ". " + converters[i].title);
        }
        IO.println((converters.length + 1) + ". BMI Calculator – Compute BMI and category");
        IO.println((converters.length + 2) + ". Grade Converter – Percentage → Letter grade");
        IO.println((converters.length + 3) + ". Exit");
        IO.println("================================================");

        IO.print("Choose Option (1-" + (converters.length + 3) + "): ");
        return Utility.validateOption(1, converters.length + 3);
    }

    /**
     * Handles a selected converter option, including sub-menu logic for repeated conversions,
     * returning to main menu, or exiting.
     *
     * @param converterOption the option selected from the main menu
     * @return true if the main loop should continue, false if the application should exit
     */
    static boolean handleConverter(int converterOption) {
        ConverterTool tool = null;
        String converterTitle;
        boolean isGeneric = false;

        // Determine converter type
        if (converterOption <= converters.length) {
            tool = converters[converterOption - 1];
            converterTitle = tool.title;
            isGeneric = true;
        } else if (converterOption == converters.length + 1) {
            converterTitle = "BMI Calculator – Compute BMI and category";
        } else {
            converterTitle = "Grade Converter – Percentage → Letter grade";
        }

        // Display header once
        IO.println("------------------------------------------------");
        IO.println(converterTitle);
        IO.println("------------------------------------------------");

        boolean inSubMenu = false;
        int selectedSubOption = 0;
        do {
            String result;
            ConversionResult conversion = null;

            // Handle conversion
            if (isGeneric) {
                conversion = commonConverter(tool.options, inSubMenu, selectedSubOption);
                selectedSubOption = conversion.displaySubOption();
                result = conversion.toString(); // displayResult()
            } else if (converterOption == converters.length + 1) {
                result = bmiConverter();
            } else {
                result = gradeConverter();
            }

            // Display result
            IO.println("Result: " + result);
            displayDateTime();
            pressEnterToContinue();

            // Handle sub-menu
            int nextOption;
            if (isGeneric) {
                // Generic converter sub-menu
                IO.print(selectSubMenu(conversion.fromUnit, conversion.toUnit, converterTitle));
                nextOption = Utility.validateOption(1, 4);

                switch (nextOption) {
                    case 1 -> inSubMenu = true;  // Repeat same conversion
                    case 2 -> inSubMenu = false; // Return to converter menu
                    case 3 -> { return true; }   // Return to main menu
                    case 4 -> {                  // Exit
                        IO.println("Exiting the converter....\nThank you. Come Again!");
                        return false;
                    }
                }
            } else {
                // BMI or Grade converter sub-menu
                IO.print(selectSubMenu(converterTitle));
                nextOption = Utility.validateOption(1, 3);

                switch(nextOption) {
                    case 2 -> { return true; }    // Main menu
                    case 3 -> {                   // Exit
                        IO.println("Exiting the converter....\nThank you. Come Again!");
                        return false;
                    }
                }
            }

        } while (true);
    }

    /**
     * Sub-menu prompt for BMI or Grade converters.
     *
     * @param converterTitle title of the converter
     * @return formatted string for sub-menu
     */
    static String selectSubMenu(String converterTitle){
        return String.format("""
            What do you want to do next?
            1. Return to %s
            2. Return to Main Menu
            3. Exit
            ================================================
            Choose Option (1-3):\s""", converterTitle);
    }

    /**
     * Sub-menu prompt for generic converters, with repeat conversion option.
     *
     * @param fromUnit source unit
     * @param toUnit target unit
     * @param converterTitle title of the converter
     * @return formatted string for sub-menu
     */
    static String selectSubMenu(String fromUnit, String toUnit, String converterTitle){
        return String.format("""
            What do you want to do next?
            1. Repeat %s -> %s Conversion
            2. Return to %s
            3. Return to Main Menu
            4. Exit
            ================================================
            Choose Option (1-4):\s""", fromUnit, toUnit, converterTitle);
    }

    /**
     * Displays current date and time when a conversion is completed.
     */
    static void displayDateTime() {
        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        IO.println("Converted at: " + today + " " + timeNow.format(formatter) +
                "\n================================================");
    }

    /**
     * Pauses execution until user presses ENTER.
     * Clears leftover input from the scanner to avoid issues with next input.
     */
    static void pressEnterToContinue() {
        IO.print("Press ENTER to continue...");
        Utility.scanner.nextLine(); // clear leftover newline
        Utility.scanner.nextLine(); // wait for user input
    }
}
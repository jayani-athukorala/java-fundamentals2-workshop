package se.lexicon;

import java.util.Scanner;

public class Converter {

    public static final Scanner scanner = new Scanner(System.in);

    // =======================
    // Currency Converter
    // =======================
    /** This method will convert SEK <-> USD and SEK <-> EUR */
    static String currencyConverter(){
        String displayResult = "";
        double value, result;

        IO.print("""
                1. SEK -> USD
                2. USD -> SEK
                3. SEK -> EUR
                4. EUR -> SEK
                Select Option (1-4) :\s""");
        int option = Utility.getOption(1, 4);

        switch (option){
            case 1 :
                IO.print("Enter Currency in SEK : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.sekToUsd(value); // SEK -> USD
                // Format values to 2 decimal places
                displayResult = String.format("%.2f SEK = %.2f USD", value, result);
                break;
            case 2 :
                IO.print("Enter Currency in USD : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.usdToSek(value); // USD -> SEK
                displayResult = String.format("%.2f USD = %.2f SEK", value, result);
                break;
            case 3 :
                IO.print("Enter Currency in SEK : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.sekToEur(value); // SEK -> EUR
                displayResult = String.format("%.2f SEK = %.2f EUR", value, result);
                break;
            case 4 :
                IO.print("Enter Currency in EUR : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.eurToSek(value); // EUR -> SEK
                displayResult = String.format("%.2f EUR = %.2f SEK", value, result);
                break;
        }

        return displayResult;
    }

    // =======================
    // Temperature Converter
    // =======================
    /** This method will convert °C <-> °F */
    static String temperatureConverter(){
        String displayResult = "";
        double value, result;

        IO.print("""
                1. Celsius (°C) -> Fahrenheit (°F)
                2. Fahrenheit (°F) -> Celsius (°C)
                Select Option (1-2) :\s""");
        int option = Utility.getOption(1, 2);

        switch (option){
            case 1 :
                IO.print("Enter Temperature in Celsius (°C) : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.celsiusToFahrenheit(value);
                displayResult = String.format("%.2f °C = %.2f °F", value, result);
                break;
            case 2 :
                IO.print("Enter Temperature in Fahrenheit (°F) : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.fahrenheitToCelsius(value);
                displayResult = String.format("%.2f °F = %.2f °C", value, result);
                break;
        }

        return displayResult;
    }

    // =======================
    // Length Converter
    // =======================
    /** This method will convert KM <-> M */
    static String lengthConverter(){

        String displayResult = "";
        double value, result;

        IO.print("""
                1. Kilometers (KM) -> Meters (M)
                2. Meters (M) -> Kilometers (KM)
                Select Option (1-2) : \s""");
        int option = Utility.getOption(1, 2);
        switch (option){
            case 1 :
                IO.print("Enter Value in Kilometers (KM) : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.kmToM(value);
                displayResult = String.format("%.2f KM = %.2f M", value, result);
                break;
            case 2 :
                IO.print("Enter Value in Meters (M) : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.mToKm(value);
                displayResult = String.format("%.2f M = %.2f KM", value, result);
                break;
        }

        return displayResult;
    }

    // =======================
    // Weight Converter
    // =======================
    /** This method will convert KG <-> G */
    static String weightConverter(){

        String displayResult = "";
        double value, result;

        IO.print("""
                1. Kilograms (KG) -> Grams (G)
                2. Grams (G) -> Kilograms (KG)
                Select Option (1-2) : \s""");
        int option = Utility.getOption(1, 2);
        switch (option){
            case 1 :
                IO.print("Enter Value in Kilograms (KG) : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.kgToG(value);
                displayResult = String.format("%.2f KG = %.2f G", value, result);
                break;
            case 2 :
                IO.print("Enter Value in Grams (G) : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.gToKg(value);
                displayResult = String.format("%.2f G = %.2f KG", value, result);
                break;
        }

        return displayResult;
    }

    // =======================
    // Time Converter
    // =======================
    /** This method will convert Hours ↔ Minutes */
    static String timeConverter(){
        String displayResult = "";
        double value, result;

        IO.print("""
                1. Hours -> Minutes
                2. Minutes -> Hours
                Select Option (1-2) :\s""");
        int option = Utility.getOption(1, 2);

        switch (option){
            case 1 :
                IO.print("Enter Time in Hours : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.hoursToMinutes(value); // Hours > Minutes
                displayResult = value + " Hours = " + result + " Minutes";
                break;
            case 2 :
                IO.print("Enter Time in Minutes : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.minutesToHours(value); // Minutes -> Hours
                displayResult = value + " Minutes = " + result + " Hours";
                break;
        }

        return displayResult;
    }

    // =======================
    // Speed Converter
    // =======================
    /** This method converts km/h ↔ m/s */
    static String speedConverter(){
        String displayResult = "";
        double value, result;

        IO.print("""
                1. KM/H -> M/S
                2. M/S -> KM/H
                Select Option (1-2) :\s""");
        int option = Utility.getOption(1, 2);

        switch (option){
            case 1 :
                IO.print("Enter Speed in KM/H : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.kmhToMs(value);
                displayResult = String.format("%.2f KM/H = %.2f M/S", value, result);
                break;
            case 2 :
                IO.print("Enter Speed in M/S : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.msToKmh(value);
                displayResult = String.format("%.2f M/S = %.2f KM/H", value, result);
                break;
        }

        return displayResult;
    }

    // =======================
    // Fuel Consumption Converter
    // =======================
    /** This method converts L/100km ↔ km/L */
    static String fuelConsumptionConverter(){
        String displayResult = "";
        double value, result;

        IO.print("""
                1. L/100KM -> KM/L
                2. KM/L -> L/100KM
                Select Option (1-2) :\s""");
        int option = Utility.getOption(1, 2);

        switch (option){
            case 1 :
                IO.print("Enter Fuel Consumption in L/100KM : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.lPer100kmToKmPerL(value);
                displayResult = String.format("%.2f L/100KM = %.2f KM/L", value, result);
                break;
            case 2 :
                IO.print("Enter Fuel Consumption in KM/L : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.kmPerLToLPer100km(value);
                displayResult = String.format("%.2f KM/L = %.2f L/100KM", value, result);
                break;
        }

        return displayResult;
    }

    // =======================
    // Data Storage Converter
    // =======================
    /** This method converts KB ↔ MB ↔ GB */
    static String dataStorageConverter(){
        String displayResult = "";
        double value, result;

        IO.print("""
                1. KB -> MB
                2. MB -> KB
                3. MB -> GB
                4. GB -> MB
                Select Option (1-4) :\s""");
        int option = Utility.getOption(1, 4);

        switch (option){
            case 1 :
                IO.print("Enter Data Storage Type in KB : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.kbToMb(value);
                displayResult = String.format("%.2f KB = %.2f MB", value, result);
                break;
            case 2 :
                IO.print("Enter Data Storage Type in MB : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.mbToKb(value);
                displayResult = String.format("%.2f MB = %.2f KB", value, result);
                break;
            case 3 :
                IO.print("Enter Data Storage Type in MB : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.mbToGb(value);
                displayResult = String.format("%.2f MB = %.2f GB", value, result);
                break;
            case 4 :
                IO.print("Enter Data Storage Type in GB : ");
                value = scanner.nextDouble();
                result = ConverterFormulas.gbToMb(value);
                displayResult = String.format("%.2f GB = %.2f MB", value, result);
                break;
        }

        return displayResult;
    }

    // =======================
    // BMI Converter
    // =======================
    /** This method computes BMI Value */
    static String bmiConverter(){
        String displayResult;
        IO.print("Enter Height (M): ");
        double height = scanner.nextDouble();

        IO.print("Enter Weight (KG) :");
        double weight = scanner.nextDouble();

        double bmiValue = ConverterFormulas.calculateBmi(height, weight);
        displayResult = String.format(" BMI = %.2f \n BMI Category = %s", bmiValue, ConverterFormulas.bmiCategory(bmiValue));
        return displayResult;
    }

    // =======================
    // Grade Converter
    // =======================
    /** This method converts the student's Mark -> Grade */
    static String gradeConverter(){
        String displayResult;
        IO.println("Enter Student's Mark (%) : ");
        int studentMark = scanner.nextInt();
        try {
            if (studentMark < 0 || studentMark > 100){
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            IO.println("Error! Mark should be a value between 0 - 100");
            gradeConverter();
        }

        displayResult = String.format("%d %% Mark = Grade %s", studentMark, ConverterFormulas.markToGrade(studentMark));
        return displayResult;
    }

}

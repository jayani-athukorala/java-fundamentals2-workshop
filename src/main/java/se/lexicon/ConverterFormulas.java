package se.lexicon;

/**
 * ConverterFormulas
 * This utility class contains static methods used to convert values
 * between different measurement units such as currency, temperature,
 * length, weight, time, speed, data storage, and more.
 * All methods are static because they perform calculations and do not
 * require an instance of the class.
 */
public class ConverterFormulas {

    // =======================
    // Currency Conversions
    // =======================

    /**
     * Converts Swedish Krona (SEK) to US Dollars (USD).
     * Formula: USD = SEK * 0.11
     *
     * @param sek amount in Swedish Króna
     * @return equivalent amount in US Dollars
     */
    public static double sekToUsd(double sek) {
        return sek * 0.11;
    }

    /**
     * Converts US Dollars (USD) to Swedish Krona (SEK).
     * Formula: SEK = USD / 0.11
     *
     * @param usd amount in US Dollars
     * @return equivalent amount in Swedish Króna
     */
    public static double usdToSek(double usd) {
        return usd / 0.11;
    }

    /**
     * Converts Swedish Krona (SEK) to Euros (EUR).
     * Formula: EUR = SEK * 0.093
     *
     * @param sek amount in Swedish Króna
     * @return equivalent amount in Euros
     */
    public static double sekToEur(double sek) {
        return sek * 0.093;
    }

    /**
     * Converts Euros (EUR) to Swedish Króna (SEK).
     * Formula: SEK = EUR / 0.093
     *
     * @param eur amount in Euros
     * @return equivalent amount in Swedish Króna
     */
    public static double eurToSek(double eur) {
        return eur / 0.093;
    }

    // =======================
    // Temperature Conversions
    // =======================

    /**
     * Converts Celsius to Fahrenheit.
     * Formula: °F = (°C × 9/5) + 32
     *
     * @param celsius temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * Formula: °C = (°F − 32) × 5/9
     *
     * @param fahrenheit temperature in Fahrenheit
     * @return temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // =======================
    // Length Conversions
    // =======================

    /**
     * Converts kilometers to meters.
     * Formula: meters = kilometers × 1000
     *
     * @param kilometers distance in kilometers
     * @return distance in meters
     */
    public static double metersToKilometers(double kilometers) {
        return kilometers * 1000;
    }

    /**
     * Converts meters to kilometers.
     * Formula: kilometers = meters ÷ 1000
     *
     * @param meters distance in meters
     * @return distance in kilometers
     */
    public static double kilometersToMeters(double meters) {
        return meters / 1000;
    }

    // =======================
    // Weight Conversions
    // =======================

    /**
     * Converts kilograms to grams.
     * Formula: grams = kilograms × 1000
     *
     * @param kilograms weight in kilograms
     * @return weight in grams
     */
    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000;
    }

    /**
     * Converts grams to kilograms.
     * Formula: kilograms = grams ÷ 1000
     *
     * @param grams weight in grams
     * @return weight in kilograms
     */
    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    // =======================
    // Time Conversions
    // =======================

    /**
     * Converts hours to minutes.
     * Formula: minutes = hours × 60
     *
     * @param hours time in hours
     * @return time in minutes
     */
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    /**
     * Converts minutes to hours.
     * Formula: hours = minutes ÷ 60
     *
     * @param minutes time in minutes
     * @return time in hours
     */
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    // =======================
    // Speed Conversions
    // =======================

    /**
     * Converts kilometers per hour (km/h) to meters per second (m/s).
     * Formula: m/s = km/h ÷ 3.6
     *
     * @param kilometersPerHour speed in km/h
     * @return speed in m/s
     */
    public static double kilometersPerHourToMetersPerSecond(double kilometersPerHour) {
        return kilometersPerHour / 3.6;
    }

    /**
     * Converts meters per second (m/s) to kilometers per hour (km/h).
     * Formula: km/h = m/s × 3.6
     *
     * @param metersPerSecond speed in m/s
     * @return speed in km/h
     */
    public static double metersPerSecondToKilometersPerHour(double metersPerSecond) {
        return metersPerSecond * 3.6;
    }

    // =======================
    // Fuel Consumption
    // =======================

    /**
     * Converts liters per 100 km to kilometers per liter.
     * Formula: km/l = 100 ÷ (liters per 100 km)
     *
     * @param lPer100km fuel consumption in liters per 100 km
     * @return fuel efficiency in km per liter
     */
    public static double litersPer100kmToKmPerLiter(double lPer100km) {
        return 100 / lPer100km;
    }

    /**
     * Converts kilometers per liter to liters per 100 km.
     * Formula: L/100km = 100 ÷ (km per liter)
     *
     * @param kmPerL efficiency in km per liter
     * @return fuel consumption in liters per 100 km
     */
    public static double kmPerLiterToLitersPer100km(double kmPerL) {
        return 100 / kmPerL;
    }

    // =======================
    // Data Storage
    // =======================

    /**
     * Converts kilobytes to megabytes.
     * Formula: MB = KB ÷ 1024
     */
    public static double kiloBytesToMegaBytes(double kilobytes) {
        return kilobytes / 1024;
    }

    /**
     * Converts megabytes to kilobytes.
     * Formula: KB = MB × 1024
     */
    public static double megaBytesToKiloBytes(double megabytes) {
        return megabytes * 1024;
    }

    /**
     * Converts megabytes to gigabytes.
     * Formula: GB = MB ÷ 1024
     */
    public static double megaBytesToGigaBytes(double megabytes) {
        return megabytes / 1024;
    }

    /**
     * Converts gigabytes to megabytes.
     * Formula: MB = GB × 1024
     */
    public static double gigaBytesToMegaBites(double gigabytes) {
        return gigabytes * 1024;
    }

    // =======================
    // BMI Calculations
    // =======================

    /**
     * Calculates Body Mass Index (BMI).
     * Formula: BMI = weight(kg) / height(m)^2
     *
     * @param heightMeters height in meters
     * @param weightKg weight in kilograms
     * @return calculated BMI value
     */
    public static double calculateBmi(double heightMeters, double weightKg) {
        return weightKg / (heightMeters * heightMeters);
    }

    /**
     * Determines BMI category based on BMI value.
     *
     * @param bmi calculated BMI value
     * @return BMI category (Underweight, Normal weight, Overweight, Obese)
     */
    public static String bmiCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    // =======================
    // Grade Conversion
    // =======================

    /**
     * Converts a student's mark (percentage) into a grade (A–F).
     *
     * @param mark percentage mark
     * @return grade character (A, B, C, D, E, or F)
     */
    public static char markToGrade(int mark) {
        if (mark > 84) return 'A';
        else if (mark > 74) return 'B';
        else if (mark > 64) return 'C';
        else if (mark > 49) return 'D';
        else if (mark > 34) return 'E';
        else return 'F';
    }
}
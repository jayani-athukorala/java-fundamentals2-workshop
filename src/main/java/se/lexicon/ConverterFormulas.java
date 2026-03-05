package se.lexicon;

public class ConverterFormulas {

    // =======================
    // Currency Formulas
    // =======================
    /** SEK to USD: USD = SEK * 0.11 */
    public static double sekToUsd(double sek) {
        return sek * 0.11;
    }

    /** USD to SEK: SEK = USD / 0.11 */
    public static double usdToSek(double usd) {
        return usd / 0.11;
    }

    /** SEK to EUR: EUR = SEK * 0.093 */
    public static double sekToEur(double sek) {
        return sek * 0.093;
    }

    /** EUR to SEK: SEK = EUR / 0.093 */
    public static double eurToSek(double eur) {
        return eur / 0.093;
    }

    // =======================
    // Temperature Formulas
    // =======================
    /** Celsius to Fahrenheit: °F = (°C * 9/5) + 32 */
    public static double celsiusToFahrenheit(double c) { return (c * 9/5) + 32; }

    /** Fahrenheit to Celsius: °C = (°F - 32) * 5/9 */
    public static double fahrenheitToCelsius(double f) { return (f - 32) * 5/9; }

    // =======================
    // Length Formulas
    // =======================
    /** Kilometers to Meters: M = KM * 1000 */
    public static double kmToM(double km) {
        return km * 1000;
    }

    /** Meters to Kilometers: KM = M / 1000 */
    public static double mToKm(double m) {
        return m / 1000;
    }

    // =======================
    // Weight Formulas
    // =======================

    /** Kilograms to Grams: G = KG * 1000 */
    public static double kgToG(double kg) {
        return kg * 1000;
    }

    /** Grams to Kilograms: KG = G / 1000 */
    public static double gToKg(double g) {
        return g / 1000;
    }

    // =======================
    // Time Formulas
    // =======================
    /** Hours to Minutes: Minutes = Hours * 60 */
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    /** Minutes to Hours: Hours = Minutes / 60 */
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    // =======================
    // Speed Formulas
    // =======================
    /** KM/H to M/S: m/s = km/h ÷ 3.6 */
    public static double kmhToMs(double kmh) {
        return kmh / 3.6;
    }

    /** M/S to KM/H: km/h = m/s * 3.6 */
    public static double msToKmh(double ms) {
        return ms * 3.6;
    }

    // =======================
    // Fuel Consumption Formulas
    // =======================
    /** L/100KM to KM/L: KM/L = 100 ÷ L/100KM */
    public static double lPer100kmToKmPerL(double lPer100km) {
        return 100 / lPer100km;
    }

    /** KM/L to L/100KM: L/100KM = 100 ÷ KM/L */
    public static double kmPerLToLPer100km(double kmPerL) {
        return 100 / kmPerL;
    }

    // =======================
    // Data Storage Formulas
    // =======================
    /** KB to MB: MB = KB ÷ 1024 */
    public static double kbToMb(double kb) {
        return kb / 1024;
    }

    /** MB to KB: KB = MB * 1024 */
    public static double mbToKb(double mb) {
        return mb * 1024;
    }

    /** MB to GB: GB = MB ÷ 1024 */
    public static double mbToGb(double mb) {
        return mb / 1024;
    }

    /** GB to MB: MB = GB * 1024 */
    public static double gbToMb(double gb) {
        return gb * 1024;
    }

    // =======================
    // BMI Formulas
    // =======================
    /** Calculate BMI: BMI = weight(kg) / (height(m) * height(m)) */
    public static double calculateBmi(double heightMeters, double weightKg) {
        return weightKg / (heightMeters * heightMeters);
    }

    /** Determine BMI Category based on BMI value */
    public static String bmiCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    // =======================
    // Grade Formulas
    // =======================
    /** Convert student mark (%) to grade (A-F) */
    public static char markToGrade(int mark) {
        if (mark > 84) return 'A';
        else if (mark > 74) return 'B';
        else if (mark > 64) return 'C';
        else if (mark > 49) return 'D';
        else if (mark > 34) return 'E';
        else return 'F';
    }
}
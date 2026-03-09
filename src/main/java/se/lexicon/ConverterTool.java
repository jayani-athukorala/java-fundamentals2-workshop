package se.lexicon;

/**
 * ConverterTool
 * Represents a converter category/tool, e.g., Currency, Temperature, Length, etc.
 * Each ConverterTool has a title and a set of ConversionOptions, which define
 * the units that can be converted and the formula to use for the conversion.
 */
public class ConverterTool {

    /** Title of the converter tool (e.g., "Currency Converter – SEK ↔ USD, SEK ↔ EUR") */
    public String title;

    /** Array of conversion options available in this tool */
    public ConversionOption[] options;

    /**
     * Constructor to create a ConverterTool with a title and a list of options.
     *
     * @param title   Name or description of the converter tool
     * @param options Array of ConversionOption objects representing supported conversions
     */
    ConverterTool(String title, ConversionOption[] options){
        this.title = title;
        this.options = options;
    }

    /**
     * Static array containing all the available converter tools in the system.
     * Each ConverterTool contains a set of ConversionOption objects that map
     * a source unit to a target unit using a formula from ConverterFormulas.
     */
    public static ConverterTool[] converters = {

            // Currency Converter with SEK ↔ USD and SEK ↔ EUR
            new ConverterTool("Currency Converter - SEK <-> USD, SEK <-> EUR", new ConversionOption[]{
                    new ConversionOption("SEK", "USD", ConverterFormulas::sekToUsd),
                    new ConversionOption("USD", "SEK", ConverterFormulas::usdToSek),
                    new ConversionOption("SEK", "EUR", ConverterFormulas::sekToEur),
                    new ConversionOption("EUR", "SEK", ConverterFormulas::eurToSek)
            }),

            // Temperature Converter with Celsius ↔ Fahrenheit
            new ConverterTool("Temperature Converter - Celsius <-> Fahrenheit", new ConversionOption[]{
                    new ConversionOption("°C", "°F", ConverterFormulas::celsiusToFahrenheit),
                    new ConversionOption("°F", "°C", ConverterFormulas::fahrenheitToCelsius)
            }),

            // Length Converter with Meters ↔ Kilometers
            new ConverterTool("Length Converter - Meters <-> Kilometers", new ConversionOption[]{
                    new ConversionOption("M", "KM", ConverterFormulas::metersToKilometers),
                    new ConversionOption("KM", "M", ConverterFormulas::kilometersToMeters)
            }),

            // Weight Converter with Kilograms ↔ Grams
            new ConverterTool("Weight Converter - Kilograms <-> Grams", new ConversionOption[]{
                    new ConversionOption("KG", "G", ConverterFormulas::kilogramsToGrams),
                    new ConversionOption("G", "KG", ConverterFormulas::gramsToKilograms)
            }),

            // Time Converter with Hours ↔ Minutes
            new ConverterTool("Time Converter - Hours <-> Minutes", new ConversionOption[]{
                    new ConversionOption("Hours", "Minutes", ConverterFormulas::hoursToMinutes),
                    new ConversionOption("Minutes", "Hours", ConverterFormulas::minutesToHours)
            }),

            // Speed Converter with km/h ↔ m/s
            new ConverterTool("Speed Converter - km/h <-> m/s", new ConversionOption[]{
                    new ConversionOption("KM/H", "M/S", ConverterFormulas::kilometersPerHourToMetersPerSecond),
                    new ConversionOption("M/S", "KM/H", ConverterFormulas::metersPerSecondToKilometersPerHour)
            }),

            // Fuel Consumption Converter with L/100km ↔ km/L
            new ConverterTool("Fuel Consumption Converter - L/100km <-> km/L", new ConversionOption[]{
                    new ConversionOption("L/100KM", "KM/L", ConverterFormulas::litersPer100kmToKmPerLiter),
                    new ConversionOption("KM/L", "L/100KM", ConverterFormulas::kmPerLiterToLitersPer100km)
            }),

            // Data Storage Converter with KB ↔ MB ↔ GB
            new ConverterTool("Data Storage Converter - KB <-> MB <-> GB", new ConversionOption[]{
                    new ConversionOption("KB", "MB", ConverterFormulas::kiloBytesToMegaBytes),
                    new ConversionOption("MB", "KB", ConverterFormulas::megaBytesToKiloBytes),
                    new ConversionOption("MB", "GB", ConverterFormulas::megaBytesToGigaBytes),
                    new ConversionOption("GB", "MB", ConverterFormulas::gigaBytesToMegaBites)
            }),

    };
}
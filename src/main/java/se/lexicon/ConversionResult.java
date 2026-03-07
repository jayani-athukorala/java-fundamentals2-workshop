package se.lexicon;

/**
 * ConversionResult
 * Represents the outcome of a single unit conversion.
 * Stores the input unit, target unit, selected option, input value, and the converted result.
 * Can be used for logging, displaying results to the user, or storing conversion history.
 */
public class ConversionResult {

    /** The unit being converted from (e.g., "SEK", "°C", "KM") */
    public String fromUnit;

    /** The unit being converted to (e.g., "USD", "°F", "M") */
    public String toUnit;

    /** Index or identifier of the selected sub-option within a ConverterTool */
    int selectedSubOption;

    /** The value provided by the user to convert */
    double inputValue;

    /** The resulting value after applying the conversion formula */
    double resultValue;

    /**
     * Constructor to create a ConversionResult object.
     *
     * @param fromUnit        Source unit of the conversion
     * @param toUnit          Target unit of the conversion
     * @param selectedSubOption Index or identifier of the conversion option selected
     * @param inputValue      The original value to convert
     * @param resultValue     The calculated result after conversion
     */
    ConversionResult(String fromUnit, String toUnit, int selectedSubOption, double inputValue, double resultValue){
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.selectedSubOption = selectedSubOption;
        this.inputValue = inputValue;
        this.resultValue = resultValue;
    }

    /**
     * Returns a formatted string representation of the conversion result.
     * Example output: "1 100.00 SEK = 11.00 USD"
     *
     * @return String representing the conversion in a readable format
     */
    @Override
    public String toString() {
        return String.format("%.2f %s = %.2f %s", inputValue, fromUnit, resultValue, toUnit);
    }
}
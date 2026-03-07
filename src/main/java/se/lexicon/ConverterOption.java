package se.lexicon;

import java.util.function.Function;

/**
 * Represents a unit conversion option.
 * This class stores the source unit, target unit, and the formula
 * used to convert a value from the source unit to the target unit.
 */
class ConversionOption {

    // The unit we are converting FROM (e.g., "Celsius")
    String fromUnit;

    // The unit we are converting TO (e.g., "Fahrenheit")
    String toUnit;

    /**
     * A function that defines the conversion formula.
     * It takes a Double input (the value to convert)
     * and returns a Double output (the converted value).
     * Example: c -> (c * 9/5) + 32
     */
    Function<Double, Double> formula;

    /**
     * Constructor to create a conversion option.
     *
     * @param fromUnit The source unit (unit being converted from)
     * @param toUnit   The target unit (unit being converted to)
     * @param formula  The conversion formula implemented as a Function
     */
    ConversionOption(String fromUnit, String toUnit, Function<Double, Double> formula){
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.formula = formula;
    }
}
package se.lexicon;

/**
 * Converter
 * This class contains static methods to perform actual conversions.
 * It supports:
 *  - Generic conversions between units using ConversionOption (commonConverter)
 *  - BMI calculation (bmiConverter)
 *  - Student mark to grade conversion (gradeConverter)
 * Each method handles user input, validates it, performs the conversion, and returns results.
 */
public class Converter {

    // =======================
    // Common Converter
    // =======================

    /**
     * Performs a generic conversion for double values based on the provided ConversionOption array.
     * This method can be used both in main menu or a sub-menu context:
     *  - If inSubMenu is false → displays options and asks user to select one
     *  - If inSubMenu is true  → uses the externally provided selectedSubmenu index
     * Steps:
     * 1. Display available conversion options if not in sub-menu.
     * 2. Validate user selection (or use provided index in sub-menu).
     * 3. Prompt user for input value in the source unit.
     * 4. Apply the conversion formula.
     * 5. Return a ConversionResult object storing input, output, units, and selected option.
     *
     * @param options           Array of ConversionOption objects representing available conversions
     * @param inSubMenu         True if this is called from a sub-menu (selection already known)
     * @param selectedSubmenu   Index of selected option if inSubMenu is true
     * @return ConversionResult containing the input, output, selected option, and units
     */
    public static ConversionResult commonConverter(ConversionOption[] options, boolean inSubMenu, int selectedSubmenu) {
        ConversionOption selected;
        int option;

        if (!inSubMenu) {
            // Display all available conversion options
            for (int i = 0; i < options.length; i++) {
                System.out.printf("%d. %s -> %s\n", i + 1, options[i].fromUnit, options[i].toUnit);
            }
            IO.println("================================================");
            IO.print("Choose Option (1-" + options.length + ") : ");

            // Validate user's menu selection
            option = Utility.validateOption(1, options.length);
            selected = options[option - 1];
        } else {
            // Use externally provided selection for sub-menu scenario
            option = selectedSubmenu;
            selected = options[option - 1];
        }

        // Prompt for input value in the selected unit
        IO.print("Enter Value in " + selected.fromUnit + " : ");
        double value = Utility.validateDouble(selected.fromUnit);

        // Apply conversion formula
        double result = selected.formula.apply(value);

        // Return conversion result
        return new ConversionResult(selected.fromUnit, selected.toUnit, option, value, result);
    }

    // =======================
    // BMI Converter
    // =======================

    /**
     * Computes Body Mass Index (BMI) and determines the BMI category.
     * Steps:
     * 1. Prompt the user for height (in meters) and weight (in kilograms).
     * 2. Validate the input values.
     * 3. Calculate BMI using ConverterFormulas.calculateBmi().
     * 4. Determine BMI category using ConverterFormulas.bmiCategory().
     * 5. Return a formatted string with BMI value and category.
     *
     * @return Formatted string with BMI value and BMI category
     */
    public static String bmiConverter(){
        IO.print("Enter Height (M): ");
        double height = Utility.validateDouble("Height");

        IO.print("Enter Weight (KG) :");
        double weight = Utility.validateDouble("Weight");

        double bmiValue = ConverterFormulas.calculateBmi(height, weight);
        return String.format("BMI = %.2f - BMI Category = %s", bmiValue, ConverterFormulas.bmiCategory(bmiValue));
    }

    // =======================
    // Grade Converter
    // =======================

    /**
     * Converts a student's mark (percentage) to a grade.
     * Steps:
     * 1. Prompt the user for the student's mark (0-100).
     * 2. Validate the input using Utility.validateOption().
     * 3. Convert mark to grade using ConverterFormulas.markToGrade().
     * 4. Return a formatted string displaying the mark and corresponding grade.
     *
     * @return Formatted string showing the student's mark and grade
     */
    public static String gradeConverter(){
        IO.print("Enter Student's Mark (%) : ");
        int studentMark = Utility.validateOption(0, 100);

        return String.format("Mark %d %% = Grade %s", studentMark, ConverterFormulas.markToGrade(studentMark));
    }
}
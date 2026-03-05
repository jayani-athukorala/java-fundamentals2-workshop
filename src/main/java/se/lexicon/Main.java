package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    static void main(){
        boolean repeatLoop = true;

        while (repeatLoop) {
            //Call displayMenu method to display menu
            int selectedOption = displayMenu();
            //Call the specific converter based on selected option
            repeatLoop = selectConverter(selectedOption);
        }
    }

    static int displayMenu(){
        String[] tools = {
                "Currency (SEK ↔ USD, SEK ↔ EUR)",
                "Temperature (Celsius ↔ Fahrenheit)",
                "Length (Meters ↔ Kilometers)",
                "Weight (Kilograms ↔ Grams)",
                "Time (Hours ↔ Minutes)",
                "Speed (km/h ↔ m/s)",
                "Fuel Consumption (L/100km ↔ km/L)",
                "Data Storage (KB ↔ MB ↔ GB)",
                "BMI",
                "Grade (Percentage → Letter grade)"
        };

        IO.println("============= Converter App Menu ==============");
        for (int i=0; i<10; i++){
            IO.println(i+1 +". " + tools[i] + " Converter");
        }
        IO.println("11. Exit");
        IO.println("================================================");

        IO.print("Choose Option (1-11): ");
        return Utility.getOption(1, 11);
    }

    //This method will switch to required Converter
    static boolean selectConverter(int selectedOption){
        boolean repeatSameConverter = true;

        while (repeatSameConverter) {
            String result;
            switch (selectedOption) {
                case 1:
                    result = Converter.currencyConverter();
                    break;
                case 2:
                    result = Converter.temperatureConverter();
                    break;
                case 3:
                    result = Converter.lengthConverter();
                    break;
                case 4:
                    result = Converter.weightConverter();
                    break;
                case 5:
                    result = Converter.timeConverter();
                    break;
                case 6:
                    result = Converter.speedConverter();
                    break;
                case 7:
                    result = Converter.fuelConsumptionConverter();
                    break;
                case 8:
                    result = Converter.dataStorageConverter();
                    break;
                case 9:
                    result = Converter.bmiConverter();
                    break;
                case 10:
                    result = Converter.gradeConverter();
                    break;
                default:
                    IO.println("Exiting the converter....\nThank you. Come Again!");
                    IO.println("================================================");
                    return false;
            }
            IO.println("Result : " + result);
            //Call displayDateTime method to display current time
            displayDateTime();

            try {
                // Pause for 2 seconds (2000 milliseconds)
                Thread.sleep(2000);
            }  catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }

            repeatSameConverter = nextStep(); // Ask user what to do
        }
        return true;
    }

    //This method will decide whether user need to continue or not
    static boolean nextStep(){

        IO.print("""            
            What do you want to do next?
            1. Try Again
            2. Return to Main Menu
            3. Exit
            Select Option (1-3):\s""");

        int option = Utility.getOption(1,3);

        switch(option){
            case 1:
                return true;   // repeat same converter
            case 2:
                return false;  // go back to main menu
            case 3:
                IO.println("Exiting the converter....\nThank you. Come Again!");
                IO.println("================================================");
                System.exit(0);
        }

        return false;
    }

    //This method displays current date and time
    static void displayDateTime(){
        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        IO.println("Converted at: "+ today + " " + timeNow.format(formatter) +
                "================================================");
    }
}

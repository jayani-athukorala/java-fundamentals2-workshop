package se.lexicon;

import java.util.Scanner;

public class Converter {
    static void main(){

        //Call displayMenu method to display menu
        int option = displayMenu();
    }

    static int displayMenu(){
        Scanner scanner = new Scanner(System.in);
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

        IO.println("========= Converter App Menu ===========");
        for (int i=0; i<10; i++){
            IO.println(i+1 +". " + tools[i] + " Converter");
        }
        IO.println("11. Exit");
        IO.println("========================================");

        try {
            IO.print("Choose Option (1-11): ");
            int option = scanner.nextInt();

            if(option < 1  || option > 11){
                throw new IllegalArgumentException();
            }
            return option;
        }catch (Exception e){
            IO.println("Invalid Input! The options Should be 1 -> 10.");
            scanner.nextLine();
            return displayMenu();
        }
    }
}

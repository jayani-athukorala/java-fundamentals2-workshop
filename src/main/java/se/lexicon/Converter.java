package se.lexicon;

import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Converter {

    public static final Scanner scanner = new Scanner(System.in);
    static void main(){

        //Call displayMenu method to display menu
        int selectedOption = displayMenu();
        //Call the specific converter based on selected option
        selectConverter(selectedOption);
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

        IO.println("========= Converter App Menu ===========");
        for (int i=0; i<10; i++){
            IO.println(i+1 +". " + tools[i] + " Converter");
        }
        IO.println("11. Exit");
        IO.println("========================================");

        IO.print("Choose Option (1-11): ");
        return getOption(1, 11);
    }

    static void selectConverter(int selectedOption){

        String str, result = "";
        switch (selectedOption){
//            case 1 :
//                result = currencyConverter();
//                break;
            case 2 :
                result = temperatureConverter();
                break;
            case 3 :
                str = "Length";
                result = lengthWeightConverter(str);
                break;
            case 4 :
                str = "Weight";
                result = lengthWeightConverter(str);
                break;
//            case 5 :
//                result = timeConverter();
//                break;
//            case 6 :
//                result = speedConverter();
//                break;
//            case 7 :
//                result = fuelConsumptionConverter();
//                break;
//            case 8 :
//                result = dataStorageConverter();
//                break;
            case 9 :
                result = bmiConverter();
                break;
            case 10 :
                result = gradeConverter();
                break;
            default:
                IO.println("Exiting the converter....\nThank you. Come Again!");
                IO.println("======================================");
                return;
        }
        IO.println("Result : " +result);
        //Call displayDateTime method to display current time
        displayDateTime();
    }

    //This method will validate the user input options
    static int getOption(int min, int max){
        int option = 0;
        while (true){
            try {
                option = scanner.nextInt();
                if (option < min || option > max){
                    throw new IllegalArgumentException();
                }
                break;
            }catch (Exception e){
                scanner.nextLine(); // clear invalid input
                System.out.print("Invalid option! Please enter a valid option.(" + min + " : " + max + ") : ");
            }
        }
        return option;
    }
//    static double currencyConverter(){
//
//    }

    //This method will convert °C <-> °F
    static String temperatureConverter(){
        String displayResult = "";
        double value, result;

        IO.print("""
                1. Convert Celsius (°C) -> Fahrenheit (°F)
                2. Convert Fahrenheit (°F) -> Celsius (°C)
                Select Option (1/2) :\s""");
        int option = getOption(1, 2);

        switch (option){
            case 1 :
                IO.print("Enter Temperature in Celsius (°C) : ");
                value = scanner.nextDouble();
                result = (value * 9/5) + 32;
                displayResult = value + " Celsius (°C) = " + result + " Fahrenheit (°F)";
                break;
            case 2 :
                IO.print("Enter Temperature in Fahrenheit (°F) : ");
                value = scanner.nextDouble();
                result = (value - 32) * 5/9;
                displayResult = value + " Fahrenheit (°F) = " + result + " Celsius (°C)";
                break;
        }

        return displayResult;
    }

    //This method will convert KM <-> M and KG <-> G
    static String lengthWeightConverter(String type){

        String convertOption1 = "", convertOption2 = "", displayResult = "";
        double value, result;

        if(Objects.equals(type, "Length")){
            convertOption1 = "Kilometers (KM)";
            convertOption2 = "Meters (M)";
        }else{
            convertOption1 = "Kilograms (KG)";
            convertOption2 = "Grams (G)";
        }
        IO.print("1. Convert "+convertOption1+" -> "+convertOption2+"\n" +
                 "2. Convert "+convertOption2+" -> "+convertOption1+"\n " +
                 "Select Option (1/2) : ");
        int option = getOption(1, 2);
        switch (option){
            case 1 :
                IO.print("Enter Value in "+convertOption1+" : ");
                value = scanner.nextDouble();
                result = value*1000;
                displayResult = value + " "+convertOption1+" = "+result+ " "+convertOption2;
                break;
            case 2 :
                IO.print("Enter Value in "+convertOption2+" : ");
                value = scanner.nextDouble();
                result = value/1000;
                displayResult = value + " "+convertOption2+" = "+result+ " "+convertOption1;
                break;
        }

        return displayResult;
    }

//    static double timeConverter(){
//
//    }
//
//    static double speedConverter(){
//
//    }
//
//    static double fuelConsumptionConverter(){
//
//    }
//
//    static double dataStorageConverter(){
//
//    }

    //This method computes BMI Value
    static String bmiConverter(){
        IO.print("Enter Height (M): ");
        double height = scanner.nextDouble();

        IO.print("Enter Weight (KG) :");
        double weight = scanner.nextDouble();

        double bmiValue = weight/(height*height);
        return "BMI : " + bmiValue + "\nBMI Category : " + bmiCategory(bmiValue);
    }

    //This method returns the BMI category
    static String bmiCategory(double bmiValue){
        String bmiCategory;
        if (bmiValue < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmiValue < 25) {
            bmiCategory = "Normal weight";
        } else if (bmiValue < 30) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }
        return  bmiCategory;
    }

    //This method converts the student's Mark -> Grade
    static String gradeConverter(){
        IO.println("Enter Student's Mark (%) : ");
        int studentMark = scanner.nextInt();
        try {
            if (studentMark < 0 || studentMark > 100){
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            IO.println("Error! Mark should be a value between 0 -> 100");
            gradeConverter();
        }

        char studentGrade;
        if (studentMark > 84){
            studentGrade = 'A';
        } else if (studentMark > 74) {
            studentGrade = 'B';
        }else if (studentMark > 64) {
                studentGrade = 'C';
        }else if (studentMark > 49) {
            studentGrade = 'D';
        } else if (studentMark > 34){
            studentGrade = 'E';
        }else {
            studentGrade = 'F';
        }
        return "Students Grade for Mark "+studentMark+" = " + studentGrade;
    }

    //This method displays current date and time
    static void displayDateTime(){
        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        IO.println("Converted at: "+ today + " " + timeNow.format(formatter));
    }
}

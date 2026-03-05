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
        //Call displayDateTime method to display current time
        displayDateTime();
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

        try {
            IO.print("Choose Option (1-11): ");
            int option = scanner.nextInt();

            if(option < 1  || option > 11){
                throw new IllegalArgumentException();
            }
            return option;
        }catch (Exception e){
            IO.println("Invalid Input! The options Should be (1:11).");
            scanner.nextLine();
            return displayMenu();
        }
    }

    static void selectConverter(int selectedOption){

        String str, result = "";
        switch (selectedOption){
//            case 1 :
//                result = currencyConverter();
//                break;
//            case 2 :
//                result = temperatureConverter();
//                break;
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
                break;
        }
        IO.println("Result : " +result);
    }

//    static double currencyConverter(){
//
//    }
//
//    static double temperatureConverter(){
//
//    }

    static String lengthWeightConverter(String type){
        String convertOption1 = "", convertOption2 = "", displayResult = "";
        if(Objects.equals(type, "Length")){
            convertOption1 = "Kilometers (KM)";
            convertOption2 = "Meters (M)";
        }else{
            convertOption1 = "Kilograms (KG)";
            convertOption2 = "Grams (G)";
        }
        IO.print("1. Convert "+convertOption1+" -> "+convertOption2+" \n" +
                "2. Convert "+convertOption2+" -> "+convertOption1+"\n " +
                "Select Option (1/2) : ");
        int option = scanner.nextInt();
        try {
            if (option != 1 && option !=2){
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            IO.println("Invalid option! Please select a correct option (1/2).");
            lengthWeightConverter(type);
        }
        double value, result;
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

    static String bmiConverter(){
        IO.print("Enter Height (M): ");
        double height = scanner.nextDouble();

        IO.print("Enter Weight (KG) :");
        double weight = scanner.nextDouble();

        double bmiValue = weight/(height*height);
        return "BMI : " + bmiValue + "\nBMI Category : " + bmiCategory(bmiValue);
    }

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

    static void displayDateTime(){
        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        IO.println("Converted at: "+ today + " " + timeNow.format(formatter));
    }
}

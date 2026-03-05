package se.lexicon;

import java.util.Scanner;

public class Utility {

    public static final Scanner scanner = new Scanner(System.in);
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
                System.out.print("Invalid option! Please enter a valid option.(" + min + "-" + max + ") : ");
            }
        }
        return option;
    }
}

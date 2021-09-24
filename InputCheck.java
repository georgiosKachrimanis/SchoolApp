// This class will check the users input, and also parse them as int for use in the menus.

package com.georgioskachrimanis;

import java.util.Scanner;

public class InputCheck {
    private static Scanner input = new Scanner(System.in);


    // This method will check if the input from the user is an integer.
    // If not it will ask him to repeat the input
    public static int isNumeric(String userInput) {
        int value;

        userInput= userInput.replaceAll("\\s+", "");
        if (userInput.equals("")) {
            System.out.println("No value entered, try again.");
            return -1;
        }

        try {
            value = Integer.parseInt(userInput);
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Wrong value entered. Please try again.");
        }
        return -1;
    }

    // This method is used to narrow down the available options of the user.
    public static int userChoice(int firstOption, int lastOption, int value) {

        boolean quit = false;

        while (!quit){

            if(value >= firstOption && value <= lastOption){
                quit =true;
            }else {
                System.out.println("The option you requested is not available. Try again");
                value = isNumeric(input.nextLine());
            }

        }
        return value;
    }


}

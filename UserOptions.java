// Users switch methods

package com.georgioskachrimanis;

import java.util.Scanner;

public class UserOptions {
    private static Scanner input = new Scanner(System.in);

    // Menu screen for superUser.
    public static void superUserOptions() {
        boolean quit = false;
        System.out.println("-------------------------------------------------------\n\n");

        while (!quit) {
            UsersMenu.superUserMenu();
            int choice = InputCheck.userChoice(1, 5, InputCheck.isNumeric(input.nextLine()));

            switch (choice) {
                case 1:
                    System.out.println("What is the name of the new admin");
                    Main.adminList.add(new Admin(input.nextLine()));
                    quit = true;
                    break;
                case 2: //remove administrator

                    break;
                case 3: // print admin details
                    break;
                case 4: //print admin list
                    break;
                case 5:// exit
                    System.out.println("I will await for your return my Lord.");
                    quit = true;
                    break;

            }
        }
    }


    // Menu options for admin.
    public static void adminOptions() {

        boolean quit = false;

        while (!quit) {

            UsersMenu.adminMenu();

            int choice = InputCheck.userChoice(0, 7, InputCheck.isNumeric(input.nextLine()));

            switch (choice) {
                case 0:
                    System.out.println("Good bye.");
                    quit = true;
                    break;
                case 1:
                    System.out.println("add new student function....");
                    break;
                case 2:
                    System.out.println("Adjust student balance");
                    break;
                case 3:
                    System.out.println("Add classes to student");
                    break;
                case 4:
                    System.out.println("Print menu");
                    UsersMenu.adminMenu();
                    break;
                case 5:
                    System.out.println("remove student function");
                    break;
                case 6:
                    System.out.println("Add new courses");
                    break;
                case 7:
                    System.out.println("Remove courses function");
                    break;
            }

        }


    }

    // Menu options for student.
    public static void studentOptions() {

        boolean quit = false;

        while (!quit) {
            UsersMenu.studentMenu();

            int choice = InputCheck.isNumeric(input.nextLine());
            InputCheck.userChoice(0, 4, choice);

            switch (choice) {
                case 0:
                    System.out.println("Good bye.");
                    quit = true;
                    break;
                case 1:
                    System.out.println("add new student function....");
                    break;
                case 2:
                    System.out.println("Adjust student balance");
                    break;
                case 3:
                    System.out.println("Add classes to student");
                    break;
                case 4:
                    UsersMenu.studentMenu();
                    break;
            }

        }


    }

}

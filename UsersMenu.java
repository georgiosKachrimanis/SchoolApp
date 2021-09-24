package com.georgioskachrimanis;

public class UsersMenu {


    public static void superUserMenu() {
        System.out.println("Welcome Master!\n" +
                "Available options\n\t" +
                "1. Add new Administrator\n\t" +
                "2. Remove Administrator\n\t" +
                "3. Print Administrator details.\n\t" +
                "4. Print Administrator list\n\t" +
                "5. Exit application\n" +
                "Make your choice.");
    }

    public static void adminMenu() {

        System.out.println("Welcome Administrator.\n" +
                "Available options:\n\t" +
                "1. Add new student.\n\t" +
                "2. Adjust student balance\n\t" +
                "3. Add classes to student\n\t" +
                "4. Print the menu\n\t" +
                "5. Remove Student\n\t" +
                "6. Add new Courses\n\t" +
                "7. Remove Courses\n\t" +
                "0. Exit application\n" +
                "Make your choice.\r");

    }

    public static void studentMenu() {

        System.out.println("Welcome Student.\n" +
                "Available options:\n\t" +
                "1. Check tuition balance.\n\t" +
                "2. Make a payment.\n\t" +
                "3. Enroll in a class.\n\t" +
                "0. Exit application.\n" +
                "Make your choice.\r");
    }
}

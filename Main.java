//Student database app.
// I took the idea from a youtube tutorial. Of course most of it is an exercise over list and classes.
// Slowly more options where added and eventually almost a full program emerged out of it.
// My next step is to save the data I am using so I do not need to input new users all the time to do testing.


package com.georgioskachrimanis;

import java.util.*;

public class Main {

    public static List<Admin> adminList = new ArrayList<>();
    public static List<Student> studentList = new ArrayList<>();
    public static List<Course> courseList = new ArrayList<>();

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Hidden option for Making admins
        String firstCommand = input.nextLine();
        if (firstCommand.replaceAll("\\s+", "").toLowerCase().equals("iamyourgod")){
            UserOptions.superUserOptions();
        }

        System.out.println("Welcome to Student Database Application\nPlease enter your ID:\r");
        String userLogin = input.nextLine();

        // Check if the user is an admin and load the appropriate menus.
        for (Admin checkedAdmin: adminList) {
            if (Objects.equals(checkedAdmin.getLoginID(), InputCheck.isNumeric(userLogin))){
                System.out.println("call the admin options");
                UserOptions.adminOptions();
            }
        }

        // Check if the user is a student and load the appropriate menus.
        for (Student checkedStudent: studentList) {
            if (Objects.equals((checkedStudent.getLoginID()), InputCheck.isNumeric(userLogin))){
                System.out.println("call the student options");
                UserOptions.studentOptions();
            }
        }

    }

}

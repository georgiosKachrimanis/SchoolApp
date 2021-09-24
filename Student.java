package com.georgioskachrimanis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Student {
    private static Scanner input = new Scanner(System.in);
    private final String name;
    private final int loginID;
    private int schoolYear;
    private List<Course> studentCourses;
    private double tuitionBalance;
    private static int ID =  0; // So I can start from 0000 ;)

    // Constructor
    public Student(String name) {

        this.name = name;
        this.loginID = setStudentID();
        System.out.println("What is the school year of the student: " + getName());
        this.schoolYear =  input.nextInt();
        input.nextLine();
        this.studentCourses = new ArrayList<>();
        ID ++;
    }

    public String getName() {
        return name;
    }

    public int getLoginID() {
        return loginID;
    }

    public int getSchoolYear() {
        return schoolYear;
    }


    public double getTuitionBalance() {
        return tuitionBalance;
    }

    private int setStudentID() {
        // 5 digits unique id starting with the school year.
        return ID + (schoolYear * 10000);
    }

    private static void setStudentCourses() {

    }

    // Methods


}

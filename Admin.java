package com.georgioskachrimanis;

public class Admin {
    String name;
    int loginID;
    static int ID = 1;


    // Constructor
    public Admin(String name) {
        this.name = name;
        this.loginID = this.ID;
        ID++;
        printDetails();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLoginID() {
        return loginID;
    }

    // Methods
    public void printDetails() {
        System.out.println("Name of Admin: " + getName() + "\nLogin of the admin: " + getLoginID());
    }
}

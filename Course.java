package com.georgioskachrimanis;


public class Course {
    private String name;
    private static double cost = 600;

    // Constructors
    public Course(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}


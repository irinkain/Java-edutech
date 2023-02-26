package com.company.Models;

public class Animals {
    public static String nameStatic;
    private String name;

    public Animals(){

    }

    static {
        nameStatic = "DOG";
    }

    public Animals(String name){
        this.name = name;
        nameStatic = name;
    }
}
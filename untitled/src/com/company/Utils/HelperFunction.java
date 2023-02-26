package com.company.Utils;

import com.company.Models.Car;

public class HelperFunction {
    public static String carToString(Car car){
        System.out.println("HEY");
        return "[CAR: BRAND - " + car.getBrand() + "]";
    }
}
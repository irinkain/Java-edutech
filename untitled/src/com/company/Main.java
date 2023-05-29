package com.company;

import com.company.Models.Car;
import com.company.Utils.HelperFunction;

public class Main {

    public static void main(String[] args) {
        Car.setCountry("Germany");
        Car mercedes = new Car("Mercedes");
        mercedes.setBrand("mercedes");
        Car audi = new Car("Audi");
//        Car opel = new Car();

        System.out.println(HelperFunction.carToString(audi));
    }
}

package com.company;

import com.company.Models.Car;
import com.company.Models.Circle;
import com.company.Utils.HelperFunction;

public class Main {

    public static void main(String[] args) {
//        Car.setCountry("Germany");
//        Car mercedes = new Car("Mercedes");
//        mercedes.setBrand("mercedes");
//        Car audi = new Car("Audi");
////        Car opel = new Car();
//
//        System.out.println(HelperFunction.carToString(audi));



        Circle c1 = new Circle(1,2,3,4);
        Circle c2 = new Circle();
        Circle c3 = new Circle(2,3,4);
        Circle.ricxvi = 10;
        System.out.println(Circle.ricxvi);
        c1.setRadius(2.5);
        c2.setRadius(5);
        c1.setRadius(3);
        System.out.println(c1.getLength());
        System.out.println(c1.getRadius());
        System.out.println(c2.getDoubleRadius());
        System.out.println(Circle.MAX_LENGTH);
    }
}

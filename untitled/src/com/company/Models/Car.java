package com.company.Models;

public class Car {
    private static final double MAX_CONNECTIONS = 3.14;
    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Car.country = country;
    }

    private static String country;
    private String brand;
    private String horsepower;

    public Car(){
    }

    public Car(String brand){
        this.brand = brand;
        System.out.println(country);
//        PI = 3.145;
    }
//    public String setBrand(String brand){
//        this.brand = "BRAND: " + brand;
//        return this.brand;
//    }
//    public String getBrand(){
//        return brand;
//    }

    public void invokeGetInformation(){
        getInformation();
    }

    private void getInformation(){
        if (this.brand.equals("Mercedes")){
            System.out.println("Mercedes is a car company, named after the creator's wife's name");
        }
        if (this.brand.equals("Audi")){
            System.out.println("Some info about audi");
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public String getHorsepower() {
        return horsepower;
    }
}
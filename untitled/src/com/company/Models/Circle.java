package com.company.Models;

public class Circle {
    private double radius;
    private double sigrdze;
    private double simagle;
    private double sigane;
    public static final int MAX_LENGTH = 100;
    public static final int MAX_LENGTH2 = 100;
    public static final String UserName = "Nia";


    public Circle(double radius, double sigane, double sigrdze, double simagle) {
        this.radius = radius;
        this.simagle = simagle;
        this.sigane = sigane;
        this.sigrdze = sigrdze;
    }

    public Circle(double radius, double sigane, double sigrdze) {
        this.radius = radius;
        this.sigane = sigane;
        this.sigrdze = sigrdze;
    }

    public Circle() {

    }

    public static int ricxvi;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getRicxvi() {
        return ricxvi;
    }


    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getDoubleRadius() {
        return 2 * radius;
    }

}

//public, private, protected, default
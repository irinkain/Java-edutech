package com.company.Models;

public class Circle {
    private double radius;
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public double getLength() {
        return 2 * Math.PI * radius;
    }
}
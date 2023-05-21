package com.company.Interfaces;

import com.company.AbstractClass.Figure;

public class Rectangle extends Figure implements IResizable, IColorizable{ // ISerializable
    private double sideA;
    private double sideB;
    private String color;

    @Override
    public double getLength() {
        return (sideA * 2) + (sideB * 2);
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public double minimize(int byTimes) {
        return this.getArea() / byTimes;
    }

    @Override
    public void colorize(String color) {
        this.color = color;
    }

    @Override
    public void paintCode(String code) {

    }
}

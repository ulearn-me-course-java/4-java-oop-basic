package com.example.task03;

public class Complex {
    private double x;
    private double y;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex add(Complex b) {
        return new Complex(x + b.x, y + b.y);
    }

    public Complex mul(Complex b) {
        return new Complex(x * b.x - y * b.y, x * b.y + y * b.x);
    }

    public String toString() {
        return   x + " + " + y + "i";
    }
}
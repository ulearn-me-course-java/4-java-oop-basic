package com.example.task03;

public class Complex {
    private double r;
    private double i;

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public double getI() {
        return i;
    }

    public Complex add(Complex numb) {
        double rSum = r + numb.r;
        double iSum = i + numb.i;

        return new Complex(rSum, iSum);
    }

    public Complex multiply(Complex numb) {
        double rMul = r * numb.r - i * numb.i;
        double iMul = r * numb.i + i * numb.r;

        return new Complex(rMul, iMul);
    }

    public String print() {
        return "(" + r + " + " + i + " * i)";
    }
}

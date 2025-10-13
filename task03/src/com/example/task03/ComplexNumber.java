package com.example.task03;

public class ComplexNumber {

    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.realPart + other.realPart;
        double newImaginary = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        double newReal = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double newImaginary = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        if (imaginaryPart >= 0) return realPart + "+" + imaginaryPart + "i";
        else return realPart + " - " + Math.abs(imaginaryPart) + "i";
    }
}

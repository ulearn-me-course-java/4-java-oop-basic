package com.example.task03;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double real, double imaginary) {
        this.imaginaryPart = imaginary;
        this.realPart = real;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public ComplexNumber getSum(ComplexNumber second) {
        return new ComplexNumber(realPart + second.realPart, imaginaryPart + second.imaginaryPart);
    }

    public ComplexNumber getProduct(ComplexNumber second) {
        return new ComplexNumber(realPart * second.realPart - imaginaryPart * second.imaginaryPart,
                realPart * second.imaginaryPart + imaginaryPart * second.realPart);
    }

    public String toString() {
        return realPart + " + i * (" + imaginaryPart + ")";
    }
}
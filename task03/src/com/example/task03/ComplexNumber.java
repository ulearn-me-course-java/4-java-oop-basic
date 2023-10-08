package com.example.task03;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public ComplexNumber sum(ComplexNumber number) {
        double newRe = realPart + number.realPart;
        double newIm = imaginaryPart + number.imaginaryPart;
        return new ComplexNumber(newRe, newIm);
    }
    public ComplexNumber multiplicate(ComplexNumber number) {
        double newRe = realPart * number.realPart - imaginaryPart * number.imaginaryPart;
        double newIm = imaginaryPart * number.realPart + number.imaginaryPart * realPart;
        return new ComplexNumber(newRe, newIm);
    }
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}

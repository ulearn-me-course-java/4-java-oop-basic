package com.example.task03;

public class ComplexNumber {
    public final double realPart;
    public final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber complexNum) {
        double realPart = complexNum.realPart + this.realPart;
        double imaginaryPart = complexNum.imaginaryPart + this.imaginaryPart;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber complexNum) {
        double realPart = complexNum.realPart * this.realPart - complexNum.imaginaryPart * this.imaginaryPart;
        double imaginaryPart = complexNum.realPart * this.imaginaryPart + complexNum.imaginaryPart * this.realPart;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}

package com.example.task03;

public class ComplexNumber {
    public double realPart;
    public double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber number) {
        double rPart = realPart + number.realPart;
        double iPart = imaginaryPart + number.imaginaryPart;
        return new ComplexNumber(rPart, iPart);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double rPart = (realPart * number.realPart) + (imaginaryPart * number.imaginaryPart * -1);
        double iPart = (realPart * number.imaginaryPart) + (number.realPart * imaginaryPart);
        return new ComplexNumber(rPart, iPart);
    }
}

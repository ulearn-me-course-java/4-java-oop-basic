package com.example.task03;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;

    ComplexNumber(double re, double im) {
        this.realPart = re;
        this.imaginaryPart = im;
    }

    ComplexNumber add(ComplexNumber num2) {
        return new ComplexNumber(realPart + num2.realPart, imaginaryPart + num2.imaginaryPart);
    }

    ComplexNumber multiply(ComplexNumber num2) {
        return new ComplexNumber(realPart * num2.realPart - imaginaryPart * num2.imaginaryPart, realPart * num2.imaginaryPart + imaginaryPart * num2.realPart);
    }

    public String ToString() {
        return String.format("%f %s %fi", realPart, (imaginaryPart < 0 ? "-" : "+"), Math.abs(imaginaryPart));
    }
}
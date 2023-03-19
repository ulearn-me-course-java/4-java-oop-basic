package com.example.task03;

public class ComplexN {

    private double realPart;
    private double imaginaryPart;

    public ComplexN(double realPart, double imaginaryPart) {

        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;

    }

    public ComplexN Add(ComplexN num) {

        return new ComplexN(realPart + num.realPart, imaginaryPart + num.imaginaryPart);
    }

    public ComplexN Multi(ComplexN num) {
        return new ComplexN(realPart * num.realPart - imaginaryPart * num.imaginaryPart, realPart * num.imaginaryPart + imaginaryPart * num.realPart);
    }

    public String toString() {

        return String.format("%s + %si)",realPart,imaginaryPart);
    }
}

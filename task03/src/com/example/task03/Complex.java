package com.example.task03;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    Complex add(Complex num) {
        return new Complex(realPart + num.realPart, imaginaryPart + num.imaginaryPart);
    }

    Complex multiply(Complex num) {
        return new Complex(realPart * num.realPart - num.imaginaryPart * imaginaryPart, realPart * num.imaginaryPart + imaginaryPart * num.realPart);
    }

    String tostring() {
        return realPart+" + ("+imaginaryPart+")i";
    }
}

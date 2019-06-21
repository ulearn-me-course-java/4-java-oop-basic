package com.example.task03;

class Complex {
    private double realPart;
    private double imaginaryPart;

    Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    Complex sum(Complex number) {
        double newRealPart = realPart + number.realPart;
        double newImaginaryPart = imaginaryPart + number.imaginaryPart;

        return new Complex(newRealPart, newImaginaryPart);
    }

    Complex mul(Complex number) {
        double newRealPart = realPart * number.realPart - imaginaryPart * number.imaginaryPart;
        double newImaginaryPart = realPart * number.imaginaryPart + imaginaryPart * number.realPart;

        return new Complex(newRealPart, newImaginaryPart);
    }
}

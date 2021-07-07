package com.example.task03;


public class Complex {
    private final double realPart;
    private final double imaginaryPart;


    public Complex(double realPart, double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;

    }


    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public static Complex sum(Complex a, Complex b) {
        return new Complex(a.realPart + b.realPart, b.imaginaryPart + b.imaginaryPart);
    }

    public static Complex mult(Complex a, Complex b) {
        return new Complex(a.realPart * b.realPart - a.imaginaryPart * b.imaginaryPart,
                a.realPart * b.realPart + a.imaginaryPart * b.imaginaryPart);
    }

    @Override
    public String toString() {
        return imaginaryPart < 0
                ? String.format("{0} - {1}i", realPart, Math.abs(imaginaryPart))
                : String.format("{0} + {1}i", realPart, imaginaryPart);
    }
}

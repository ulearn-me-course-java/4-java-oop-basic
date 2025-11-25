package com.example.task03;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Complex add(Complex other) {
        double newReal = this.realPart + other.realPart;
        double newImaginary = this.imaginaryPart + other.imaginaryPart;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double newImaginary = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new Complex(newReal, newImaginary);
    }

    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + Math.abs(imaginaryPart) + "i";
        }
    }
}

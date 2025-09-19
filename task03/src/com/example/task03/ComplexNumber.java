package com.example.task03;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        double real = this.realPart + complexNumber.realPart;
        double imaginary = this.imaginaryPart + complexNumber.imaginaryPart;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        double real = this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart;
        double imaginary = this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart;
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + "+" + imaginaryPart + "i";
        }
        return realPart + "-" + (-imaginaryPart) + "i";
    }
}
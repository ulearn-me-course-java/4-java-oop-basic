package com.example.task03;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber (double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add (ComplexNumber num) {
        double realPart = this.realPart + num.realPart;
        double imaginaryPart = this.imaginaryPart + num.imaginaryPart;

        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply (ComplexNumber num) {
        double realPart, imaginaryPart;
        realPart = this.realPart * num.realPart - this.imaginaryPart * num.imaginaryPart;
        imaginaryPart = this.imaginaryPart * num.realPart + this.realPart * num.imaginaryPart;

        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return "(" + realPart + "; " + imaginaryPart + ")";
    }
}

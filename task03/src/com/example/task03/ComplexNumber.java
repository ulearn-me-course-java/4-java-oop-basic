package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imgPart) {
        this.realPart = realPart;
        this.imaginaryPart = imgPart;
    }

    public ComplexNumber sum (ComplexNumber number) {
        return new ComplexNumber((this.realPart + number.realPart), (this.imaginaryPart + number.imaginaryPart));
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double newReal = realPart * number.realPart - imaginaryPart * number.imaginaryPart;
        double newImaginary = imaginaryPart * number.realPart + realPart * number.imaginaryPart;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return (realPart) + " " + (imaginaryPart);
    }
}

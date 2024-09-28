package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double real, double imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber number) {
        double newReal = number.realPart + realPart;
        double newImaginary = number.imaginaryPart + imaginaryPart;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double newReal = (number.realPart * realPart) - (number.imaginaryPart * imaginaryPart);
        double newImaginary = (number.realPart * imaginaryPart) + (number.imaginaryPart * realPart);
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        if (imaginaryPart == 0) {
            return String.format("%.2f", realPart);
        } else if (imaginaryPart > 0) {
            return String.format("%.2f + %.2fi", realPart, imaginaryPart);
        }
        return String.format("%.2f - %.2fi", realPart, -imaginaryPart);
    }
}

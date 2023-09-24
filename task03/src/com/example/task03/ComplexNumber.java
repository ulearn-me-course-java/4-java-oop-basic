package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber number) {
        double newRealPart = this.realPart + number.realPart;
        double newImaginaryPart = this.imaginaryPart + number.imaginaryPart;

        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double newRealPart = (this.realPart * number.realPart) - (this.imaginaryPart * number.imaginaryPart);
        double newImaginaryPart = (this.realPart * number.imaginaryPart) + (this.imaginaryPart * number.realPart);

        return new ComplexNumber(newRealPart, newImaginaryPart);
    }
}

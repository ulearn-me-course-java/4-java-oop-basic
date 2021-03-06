package com.example.task03;

public class ComplexNumber {
    private double realPart; //a
    private double imaginaryPart; //b

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public ComplexNumber add(ComplexNumber value) {
        return new ComplexNumber(this.realPart + value.realPart, this.imaginaryPart + value.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber value) {
        double trueRealPart = this.realPart * value.realPart - this.imaginaryPart * value.imaginaryPart;
        double trueImaginaryPart = this.realPart * value.imaginaryPart + this.imaginaryPart * value.realPart;
        return new ComplexNumber(realPart = trueRealPart,
                imaginaryPart = trueImaginaryPart);
    }

    public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
        return first.add(second);
    }

    public static ComplexNumber multiply(ComplexNumber first, ComplexNumber second) {
        return first.multiply(second);
    }

    public String toString() {
        return String.format("%s + %si", realPart, imaginaryPart);
    }
}
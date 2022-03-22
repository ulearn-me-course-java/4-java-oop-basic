package com.example.task03;

import java.util.Locale;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {}

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(real + complexNumber.real, imaginary + complexNumber.imaginary);
    }

    ComplexNumber multiply(ComplexNumber complexNumber) {
        ComplexNumber newComplexNumber = new ComplexNumber();
        newComplexNumber.setReal(real * complexNumber.real - imaginary * complexNumber.imaginary);
        newComplexNumber.setImaginary(real * complexNumber.imaginary + imaginary * complexNumber.real);
        return newComplexNumber;
    }

    public String toString() {
        return String.format("%f %fi", real, imaginary);
    }
}

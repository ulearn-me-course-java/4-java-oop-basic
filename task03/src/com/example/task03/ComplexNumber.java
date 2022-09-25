package com.example.task03;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(real + complexNumber.real, imaginary + complexNumber.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(
                real * complexNumber.real - imaginary * complexNumber.imaginary,
                real * complexNumber.imaginary + complexNumber.real * imaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("Z = %.2f + %.2f * i", real, imaginary);
        } else {
            return String.format("Z = %.2f + (%.2f) * i", real, imaginary);
        }
    }
}

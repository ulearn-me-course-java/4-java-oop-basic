package com.example.task03;

public class ComplexNumber {

    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber mul(ComplexNumber other) {
        return new ComplexNumber(real * other.real - imaginary * other.imaginary,
                real * other.imaginary + other.real * imaginary);
    }

    @Override
    public String toString() {
        return String.format("%s + %si", real, imaginary);
    }
}

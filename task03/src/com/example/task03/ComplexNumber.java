package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(real + number.real, imaginary + number.imaginary);
    }

    public ComplexNumber product(ComplexNumber number) {
        return new ComplexNumber(real * number.real - imaginary * number.imaginary, real * number.imaginary + number.real * imaginary);
    }

    public String toString() {
        return String.format("%.1f + %.1fi", real, imaginary);
    }
}

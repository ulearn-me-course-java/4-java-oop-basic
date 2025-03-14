package com.example.task03;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber addend) {
        return new ComplexNumber(real + addend.real, imaginary + addend.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber multiplicand) {
        double real = this.real * multiplicand.real - this.imaginary * multiplicand.imaginary;
        double imaginary = this.imaginary * multiplicand.imaginary + this.real * multiplicand.real;
        return new ComplexNumber(real, imaginary);
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}
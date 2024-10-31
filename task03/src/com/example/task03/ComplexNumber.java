package com.example.task03;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber number) {
        double realSum = this.real + number.real;
        double imaginarySum = this.imaginary + number.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber product(ComplexNumber number) {
        double realProduct = this.real * number.real - this.imaginary * number.imaginary;
        double imaginaryProduct = this.real * number.imaginary + this.imaginary * number.real;
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return String.format("%.2f-%.2fi", real, -imaginary);
        } else {
            return String.format("%.2f+%.2fi", real, imaginary);
        }
    }
}

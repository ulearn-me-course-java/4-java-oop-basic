package com.example.task03;

public class ComplexNumber {

    private  double real;
    private  double imaginary;

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

    public ComplexNumber add(ComplexNumber other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;

        return new ComplexNumber(resultReal, resultImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;

        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(real + number.getReal(), imaginary + number.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(real * number.getReal() - imaginary * number.getImaginary(),
                imaginary * number.getReal() + real * number.getImaginary());
    }

    public String toString() {
        return String.format("%f + %fi", real, imaginary);
    }
}

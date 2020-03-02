package com.example.task03;

import java.text.MessageFormat;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    @Override
    public String toString() {
        return imaginary > 0 ? MessageFormat.format("{0} + {1}i", real, imaginary)
                : MessageFormat.format("{0} - {1}i", real, Math.abs(imaginary));
    }

    public static ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.real + b.real, a.imaginary + b.imaginary);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.real * b.real - a.imaginary * b.imaginary,
                a.real * b.imaginary + b.real * a.imaginary);
    }
}

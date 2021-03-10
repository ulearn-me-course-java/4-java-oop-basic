package com.example.task03;

import java.util.concurrent.CompletableFuture;

public class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber complexNumber) {
        return new ComplexNumber(real + complexNumber.real, imaginary + complexNumber.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(real * complexNumber.real - imaginary * complexNumber.imaginary, imaginary * complexNumber.real + real * complexNumber.imaginary);
    }

}

package com.example.task03;

public class ComplexNumber {
    public final double real;
    public final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber complexNumber){
        return new ComplexNumber(complexNumber.real + real, complexNumber.imaginary + imaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(real * complexNumber.real - imaginary * complexNumber.imaginary, real * complexNumber.imaginary + imaginary * complexNumber.real);
    }
}
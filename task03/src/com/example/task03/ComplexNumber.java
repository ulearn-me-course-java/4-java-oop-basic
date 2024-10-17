package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber Add(ComplexNumber num2) {
        double newReal = this.real + num2.real;
        double newImaginary = this.imaginary + num2.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber Multiply(ComplexNumber num2) {
        double newReal = (this.real * num2.real) - (this.imaginary * num2.imaginary);
        double newImaginary = (this.real * num2.imaginary) + (this.imaginary * num2.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

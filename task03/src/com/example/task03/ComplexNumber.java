package com.example.task03;

public class ComplexNumber {

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }

    double real;

    public double getImaginary() {
        return imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    double imaginary;

    public ComplexNumber add(ComplexNumber second) {
        return new ComplexNumber(this.real + second.real, this.imaginary + second.imaginary);
    }
    public ComplexNumber multiply(ComplexNumber second) {
        double real = (this.real * second.real) - (this.imaginary * second.imaginary);
        double imaginary = (this.real * second.imaginary) + (this.imaginary * second.real);
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public String toString() {
        return "(" + real + (imaginary < 0 ? " - " : " + ") + Math.abs(imaginary) + "i)";
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


}

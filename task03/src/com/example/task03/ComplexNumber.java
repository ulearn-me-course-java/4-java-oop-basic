package com.example.task03;

public class ComplexNumber {
    private int real;
    private int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(real + number.real, imaginary + number.imaginary);
    }

    public ComplexNumber mul(ComplexNumber number) {
        return new ComplexNumber(real * number.real - imaginary * number.imaginary, imaginary * number.real + number.imaginary * real);
    }

    public String toString() {
        return "(" + Integer.toString(real) + ", " + Integer.toString(imaginary) + "i" + ")";
    }
}

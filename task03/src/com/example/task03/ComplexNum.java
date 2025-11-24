package com.example.task03;

public class ComplexNum {
    private int real;
    private int imaginary;

    ComplexNum(int real, int imaginary) {
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

    public ComplexNum add(ComplexNum number) {
        return new ComplexNum(real + number.real, imaginary + number.imaginary);
    }

    public ComplexNum mul(ComplexNum number) {
        return new ComplexNum(real * number.real - imaginary * number.imaginary, imaginary * number.real + number.imaginary * real);
    }

    public String toString() {
        return "(" + Integer.toString(real) + ", " + Integer.toString(imaginary) + "i" + ")";
    }
}
package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double r, double i){
        real = r;
        imaginary = i;
    }

    public void setReal(double real){
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

    public ComplexNumber Sum(ComplexNumber cn){
        return new ComplexNumber(real + cn.real, imaginary + cn.imaginary);
    }

    public ComplexNumber Multiply(ComplexNumber cn){
        double newReal = real*cn.real - imaginary * cn.imaginary;
        double newImaginary = real*cn.imaginary + cn.real * imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
}

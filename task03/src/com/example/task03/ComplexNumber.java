package com.example.task03;

public class ComplexNumber {
    private double real, imaginary;

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

    @Override
    public String toString() {
        return String.format("%f%c%fi", real, (imaginary < 0) ? '-' : '+', Math.abs(imaginary));
    }

    //на самом деле если бы изменялось первое число,
    // то логичнее наверное было бы сделать динамикой
    public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
        return new ComplexNumber(first.real + second.real, first.imaginary + second.imaginary);
    }

    public static ComplexNumber multiply(ComplexNumber first, ComplexNumber second) {
        return new ComplexNumber(first.real * second.real - first.imaginary * second.imaginary,
                first.real * second.imaginary + second.real * first.imaginary);
    }
}
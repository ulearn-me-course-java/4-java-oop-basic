package com.example.task03;

public class ComplexNumber {

    private double real, imagn;

    public ComplexNumber(double real, double imagn) {
        this.real = real;
        this.imagn = imagn;
    }

    public double modulus() {
        return Math.sqrt(real * real + imagn * imagn);
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imagn);
    }

    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(real + z.real, imagn + z.imagn);
    }

    public ComplexNumber multiply(ComplexNumber z) {
        return new ComplexNumber(real * z.real - imagn * z.imagn, imagn * z.real + real * z.imagn);
    }

    public String toString() {
        return String.format("%.2f %c %.2fi", real, (imagn < 0) ? '-' : '+', Math.abs(imagn));
    }
}

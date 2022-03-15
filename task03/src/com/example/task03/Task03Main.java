package com.example.task03;

class ComplexNumber {
    private double real;
    private double imaginaryPart;

    public ComplexNumber(double real, double imaginaryPart) {
        this.real = real;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber() {}

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.real += number.real;
        result.imaginaryPart += number.imaginaryPart;
        return result;
    }

    public String toString() {
        return Double.toString(real) + " " + Double.toString(imaginaryPart) + "i";
    }

    public ComplexNumber multiply(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.real = real * number.real - imaginaryPart * number.imaginaryPart;
        result.imaginaryPart = real * number.imaginaryPart + imaginaryPart * number.real;
        return result;
    }
}

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(10, 34);
        ComplexNumber num2 = new ComplexNumber(56, 3);
        System.out.println(num1.add(num2).toString());
        System.out.println(num1.multiply(num2).toString());
    }
}

package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;
    private final char imaginaryUnit = 'i';

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber sum){
        return new ComplexNumber(realPart + sum.realPart, imaginaryPart + sum.imaginaryPart);
    }

    public ComplexNumber mult(ComplexNumber mul){
        double a = realPart * mul.realPart - imaginaryPart * mul.imaginaryPart;
        double b = realPart * mul.imaginaryPart + mul.realPart * imaginaryPart;
        return new ComplexNumber(a, b);
    }

    @Override
    public String toString() {
        String op = "+";
        if(imaginaryPart < 0){
            op = "";
        }
        return realPart + op + imaginaryPart + imaginaryUnit;
    }
}

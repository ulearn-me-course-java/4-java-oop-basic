package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(-1, -1);
        String sumResult = c1.sum(c2).toString();
        String multResult = c1.multipl(c2).toString();
    }
}

class ComplexNumber {
    private double realPart;
    private double imaginaryPart;
    private final char imaginaryUnit = 'i';

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;
    }

    public ComplexNumber sum(ComplexNumber summand) {
        return new ComplexNumber((realPart + summand.realPart), (imaginaryPart + summand.imaginaryPart));
    }

    public ComplexNumber multipl(ComplexNumber multiplier) {
        double a = realPart * multiplier.realPart - imaginaryPart * multiplier.imaginaryPart;
        double b = realPart * multiplier.imaginaryPart + multiplier.realPart * imaginaryPart;
        return new ComplexNumber(a, b);
    }

    public String toString() {
        String operation = "+";
        if (imaginaryPart < 0) {
            operation = "";
        }
        return realPart + operation + imaginaryPart + imaginaryUnit;
    }
}
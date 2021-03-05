package com.example.task03;

import static java.lang.String.format;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;
    private final double complexNumberModulus;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
        this.complexNumberModulus = Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getComplexNumberModulus() {
        return complexNumberModulus;
    }

    public static ComplexNumber foldComplexNumbers(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        double resultRealPart = firstNumber.getRealPart() + secondNumber.getRealPart();
        double resultImaginaryPart = firstNumber.getImaginaryPart() + secondNumber.getImaginaryPart();
        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }

    public static ComplexNumber multiplyComplexNumbers(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        double freeMember = firstNumber.getRealPart() * secondNumber.getRealPart() -
                firstNumber.getImaginaryPart() * secondNumber.getImaginaryPart();
        double averageRatio = firstNumber.getRealPart() * secondNumber.getImaginaryPart() +
                firstNumber.getImaginaryPart() * secondNumber.getRealPart();
        return new ComplexNumber(freeMember, averageRatio);
    }

    public String toString() {
        return format("%s + %si", realPart, imaginaryPart);
    }
}

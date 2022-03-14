package com.example.task03;

public class ComplexNumber {
    public final double reactance;
    public final double imaginary;

    public ComplexNumber() {
        this.reactance = 0;
        this.imaginary = 0;
    }
    public ComplexNumber(double reactance, double imaginary) {
        this.reactance = reactance;
        this.imaginary = imaginary;
    }

    public static ComplexNumber GetSum(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        return new ComplexNumber(firstNumber.reactance + secondNumber.reactance,
                firstNumber.imaginary + secondNumber.imaginary);
    }
    public static ComplexNumber GetMultiplicationProduct(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        return new ComplexNumber(firstNumber.reactance * secondNumber.reactance -
                firstNumber.imaginary * secondNumber.imaginary,
                firstNumber.reactance * secondNumber.imaginary +
                        firstNumber.imaginary * secondNumber.reactance);
    }

    public String toString() {
        return "(" + reactance + "+" + imaginary + "i)";
    }
}

package com.example.task03;

import java.text.DecimalFormat;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber operand) {
        double newReal = this.real + operand.real;
        double newImaginary = this.imaginary + operand.imaginary;

        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber operand) {
        double newReal = this.real * operand.real - this.imaginary * operand.imaginary;
        double newImaginary = this.real * operand.imaginary + this.imaginary * operand.real;

        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat();
        String formattedReal = decimalFormat.format(real);
        String formattedAbsoluteImaginary = decimalFormat.format(Math.abs(imaginary));

        if(imaginary > 0) {
            return String.format("%s + %si", formattedReal, formattedAbsoluteImaginary);
        }
        else if(imaginary < 0) {
            return String.format("%s - %si", formattedReal, formattedAbsoluteImaginary);
        }

        return formattedReal;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}

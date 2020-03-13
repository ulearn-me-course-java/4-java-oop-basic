package com.example.task03;

import java.text.DecimalFormat;

class ComplexNumber {
    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(number.real + real, number.imaginary + imaginary);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(number.real * real - number.imaginary * imaginary,
                number.real * imaginary - number.imaginary * real);
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

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(10);

        String sReal = df.format(real);
        df.setPositivePrefix("+");
        return String.format("[%s%s%s]", sReal, df.format(imaginary), imaginary != 0 ? "i" : "");
    }
}
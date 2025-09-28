package com.example.task03;

import java.text.MessageFormat;

public class ComplexNum {
    private double real;
    private double imaginary;

    public ComplexNum() {
        this(0, 0);
    }

    public ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNum add(ComplexNum addable) {
        return new ComplexNum(this.real + addable.real,
                this.imaginary + addable.imaginary);
    }

    public ComplexNum mult(ComplexNum multipliable) {
        double realRes = this.real * multipliable.real - this.imaginary * multipliable.imaginary;
        double imaginaryRes = this.real * multipliable.imaginary + this.imaginary * multipliable.real;

        return new ComplexNum(realRes, imaginaryRes);
    }

    public String toString() {
        if (imaginary == 0) {
            return MessageFormat.format("{0,number,0.00}", real);
        } else if (real == 0) {
            return MessageFormat.format("{0,number,0.00}i", imaginary);
        } else {
            String sign = imaginary > 0 ? " + " : " - ";
            double absImaginary = Math.abs(imaginary);

            return MessageFormat.format("{0,number,0.00}{1}{2,number,0.00}i",
                    real, sign, absImaginary);
        }
    }
}

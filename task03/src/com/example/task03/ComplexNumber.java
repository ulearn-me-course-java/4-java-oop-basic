package com.example.task03;

public class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber() {
        new ComplexNumber(0, 0);
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        if (imaginary == 1)
            return real + " + i";
        else if (imaginary == -1)
            return real + " - i";
        else if (imaginary < 0)
            return real + " - " + -imaginary + "*i";
        else return real + " + " + imaginary + "*i";
    }

    ComplexNumber add(ComplexNumber complexNum) {
        return new ComplexNumber(real + complexNum.real, imaginary + complexNum.imaginary);
    }

    ComplexNumber multiply(ComplexNumber complexNum) {
        return new ComplexNumber(real * complexNum.real - imaginary * complexNum.imaginary,
                real * complexNum.imaginary + imaginary * complexNum.real);
    }
}

package com.example.task03;

public class Complex{

    private final double realOfPart;
    private final double imaginaryOfPart;

    public Complex(double realOfPart, double imOfPart) {
        this.realOfPart = realOfPart;
        this.imaginaryOfPart = imOfPart;
    }

    public Complex add(Complex complex) {
        return new Complex(this.realOfPart + complex.realOfPart, this.imaginaryOfPart + complex.imaginaryOfPart);
    }

    public Complex multiply(Complex complex) {
        return new Complex(this.realOfPart * complex.realOfPart - this.imaginaryOfPart * complex.imaginaryOfPart,
                this.realOfPart * complex.imaginaryOfPart + this.imaginaryOfPart * complex.realOfPart);
    }
}

package com.example.task03;

public class Complex {
    private double realPart;
    private double imaginaryPart;


    public Complex(double r, double i) {
        this.realPart = r;
        this.imaginaryPart = i;
    }

    Complex sum(Complex c) {
        double newR = this.realPart + c.realPart;
        double newI = this.imaginaryPart + c.imaginaryPart;
        Complex res = new Complex(newR, newI);
        return res;
    }

    Complex multi(Complex c) {
        double newR = this.realPart * c.realPart - this.imaginaryPart * c.imaginaryPart;
        double newI = this.imaginaryPart * c.realPart + this.realPart * c.imaginaryPart;
        Complex res = new Complex(newR, newI);
        return res;
    }

    public String toString() {
        return String.format("%s + %si", realPart, imaginaryPart);
    }
}

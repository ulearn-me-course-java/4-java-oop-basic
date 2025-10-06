package com.example.task03;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex сNumber) {
        double newReal = this.real + сNumber.real;
        double newImaginary = this.imaginary + сNumber.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex сNumber) {
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        double newReal = this.real * сNumber.real - this.imaginary * сNumber.imaginary;
        double newImaginary = this.real * сNumber.imaginary + this.imaginary * сNumber.real;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}
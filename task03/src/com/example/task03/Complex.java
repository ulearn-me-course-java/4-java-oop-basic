package com.example.task03;

public class Complex {
    private double real, imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex number){

        double real = this.real + number.real;
        double imaginary = this.imaginary + number.imaginary;

        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex number){
        double real = this.real * number.real + this.imaginary * number.imaginary * -1;
        double imaginary = this.real * number.imaginary + this.imaginary * number.real;

        return new Complex(real, imaginary);
    }

    public String toString() {
        if (Math.signum(imaginary) == -1)
            return String.format("%f%fi", real, imaginary);
        else
            return String.format("%f + %fi", real, imaginary);
    }
}
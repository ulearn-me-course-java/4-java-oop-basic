package com.example.task03;

public class Complex
{
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other)
    {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other)
    {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public String toString()
    {
        if (imaginary >= 0)
            return String.format("%.2f + %.2fi", real, imaginary);
        else
            return String.format("%.2f - %.2fi", real, -imaginary);
    }
}

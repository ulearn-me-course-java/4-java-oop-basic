package com.example.task03;

public class Complex
{
    double real;
    double imaginary;

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c)
    {
        double re = real + c.real;
        double im = imaginary + c.imaginary;
        return new Complex(re, im);
    }

    public Complex multiply(Complex c)
    {
        double re = real * c.real - imaginary * c.imaginary;
        double im = real * c.imaginary + imaginary * c.real;
        return new Complex(re, im);
    }

    @Override
    public String toString()
    {
        return String.format("(%.2f + %.2fi)", real, imaginary);
    }
}

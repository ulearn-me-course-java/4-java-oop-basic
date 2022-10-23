package com.example.task03;

public class Complex {
    private double real_part;
    private double imaginary_part;

    public Complex(double a, double b)
    {
        this.real_part = a;
        this.imaginary_part = b;
    }

    public String toString()
    {
        return String.format("%1$,.3f + %2$,.3f i", real_part, imaginary_part);
    }

    public Complex add(Complex c)
    {
        return new Complex(real_part + c.real_part, imaginary_part + c.imaginary_part);
    }

    public Complex multiply(Complex c)
    {
        return new Complex(real_part * c.real_part - imaginary_part * c.imaginary_part, real_part * c.real_part + imaginary_part * c.imaginary_part);
    }
}

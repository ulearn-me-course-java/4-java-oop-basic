package com.example.task03;

public class ComplexN
{
    private final double realPart;
    private final double imaginaryPart;

    public ComplexN(double realPart, double imaginaryPart)
    {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart()
    {
        return realPart;
    }

    public double getImaginaryPart()
    {
        return imaginaryPart;
    }

    public ComplexN add(ComplexN complexNumber)
    {
        double real = this.realPart + complexNumber.realPart;
        double imaginary = this.imaginaryPart + complexNumber.imaginaryPart;
        return new ComplexN(real, imaginary);
    }

    public ComplexN multiply(ComplexN complexNumber) //по формуле (a1+b1*i)(a2+b2*i)=(a1a2-b1b2)+(a1b2+a2b1)i
    {
        double real = this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart;
        double imaginary = this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart;
        return new ComplexN(real, imaginary);
    }

    @Override
    public String toString() //для вывода на экран в стандартной форме
    {
        if (imaginaryPart >= 0)
        {
            return realPart + "+" + imaginaryPart + "i";
        }
        return realPart + "-" + (-imaginaryPart) + "i";
    }
}
package com.example.task03;

public class ComplexNumber
{
    private final double realPart;
    private final double imaginaryPart;
    public ComplexNumber(double realPart, double imaginaryPart)
    {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public ComplexNumber add(ComplexNumber complexnumber)
    {
        double newRealPart = this.realPart + complexnumber.realPart;
        double newImaginaryPart = this.imaginaryPart + complexnumber.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }
    public ComplexNumber multiply(ComplexNumber complexNumber)
    {
        double newReal = this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart;
        double newImaginary = this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart;
        return new ComplexNumber(newReal, newImaginary);
    }
    public String toString()
    {
        return "RealPart: " + realPart + ", Imaginary Part: " + imaginaryPart;
    }
}

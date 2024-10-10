package com.example.task03;

public class ComplexNumber {
    public double imagUnit;
    public double realNumber;
    public ComplexNumber(double imagUnit, double realNumber)
    {
        this.imagUnit = imagUnit;
        this.realNumber = realNumber;
    }
    public ComplexNumber Sum(ComplexNumber number)
    {
        double imag = this.imagUnit+number.imagUnit;
        double real = this.realNumber+number.realNumber;
        return new ComplexNumber(imag,real);
    }
    public ComplexNumber multiplay(ComplexNumber number)
    {
        double real = this.realNumber * number.realNumber + this.imagUnit + number.imagUnit;
        double imag = this.realNumber * number.imagUnit + this.imagUnit * number.realNumber;
        return new ComplexNumber(imag, real);
    }
    public String toString()
    {
        return ("(" + realNumber + " + " + imagUnit + "i" + ")");

    }
}

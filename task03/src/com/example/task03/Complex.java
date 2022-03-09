package com.example.task03;

public class Complex {
    private double realNumber;
    private double imaginaryNumber;

    public Complex(double rNumber, double iNumber)
    {
        this.realNumber = rNumber;
        this.imaginaryNumber = iNumber;
    }

    Complex sum(Complex c)
    {
        double rNum = this.realNumber + c.realNumber;
        double iNum = this.imaginaryNumber + c.imaginaryNumber;
        Complex result = new Complex(rNum, iNum);
        return result;
    }
    Complex difference(Complex c)
    {
        double rNum = this.realNumber - c.realNumber;
        double iNum = this.imaginaryNumber - c.imaginaryNumber;
        Complex result = new Complex(rNum, iNum);
        return result;
    }
    Complex product(Complex c)
    {
        double rNumber = (this.realNumber * c.realNumber) - (this.imaginaryNumber * c.imaginaryNumber);
        double iNumber = (this.realNumber * c.imaginaryNumber) + (this.imaginaryNumber * c.realNumber);
        Complex result = new Complex(rNumber, iNumber);

        return result;
    }
    Complex quotient(Complex c)
    {
        double divisor = (c.realNumber * c.realNumber) + (c.imaginaryNumber * c.imaginaryNumber);
        double rNumber = ((this.realNumber * c.realNumber) + (this.imaginaryNumber * c.imaginaryNumber)) / divisor;
        double iNumber = ((this.imaginaryNumber * c.realNumber) - (this.realNumber * c.imaginaryNumber)) / divisor;
        Complex result = new Complex(rNumber, iNumber);

        return result;
    }

    public String toString()
    {
        return this.realNumber + " + " + this.imaginaryNumber+ "i";
    }
}

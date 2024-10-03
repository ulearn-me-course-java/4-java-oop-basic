package com.example.task03;

public class ComplexNumber
{
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber ComplexAdd(ComplexNumber a)
    {
        return new ComplexNumber(this.real + a.real, this.imag + a.imag);
    }

    public ComplexNumber ComplexMulti(ComplexNumber a)
    {
        return new ComplexNumber(this.real * a.real - this.imag * a.imag, this.real * a.imag + this.imag * a.real);
    }

    public String toString(){
        return (int)real + " + " + (int)imag + "i";
    }
}
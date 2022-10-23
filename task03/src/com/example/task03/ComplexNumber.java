package com.example.task03;

public class ComplexNumber{
    private final double Real;
    private final double Imaginary;

    public double getReal(){
        return Real;
    }

    public double getImaginary(){
        return Imaginary;
    }

    public ComplexNumber(double real, double imaginary){
        this.Real = real;
        this.Imaginary = imaginary;
    }

    public ComplexNumber Add(ComplexNumber term){
        return new ComplexNumber(this.Real + term.Real, this.Imaginary + term.Imaginary);
    }

    public ComplexNumber Multiply(ComplexNumber term){
        return new ComplexNumber(this.Real * term.Real - this.Imaginary * term.Imaginary,
                this.Real * term.Imaginary + this.Imaginary * term.Real);
    }

    public String toString(){
        return String.format("%s real, %s imaginary", this.Real, this.Imaginary);
    }
}

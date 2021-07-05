package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public ComplexNumber sum(ComplexNumber z){
        return new ComplexNumber(this.real+z.real, this.imaginary+z.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber z){
        return new ComplexNumber(this.real*z.real - this.imaginary*z.imaginary,
                    this.real*z.imaginary+this.imaginary*z.real);
    }
}

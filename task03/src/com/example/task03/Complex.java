package com.example.task03;

public class Complex {
    private double real;
    private double imaginary;
    public Complex(double real,double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public Complex sum(Complex c){
        return new Complex(this.real+c.real, this.imaginary+c.imaginary);
    }

    public Complex multiply(Complex c){
        return new Complex(this.real*c.real - this.imaginary*c.imaginary,
                this.real*c.imaginary+this.imaginary*c.real);
    }
}

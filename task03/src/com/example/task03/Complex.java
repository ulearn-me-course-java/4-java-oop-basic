package com.example.task03;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex){
        double real = this.real + complex.real;
        double imaginary = this.imaginary + complex.imaginary;
        return new Complex(real, imaginary);
    }

    public Complex multiply (Complex complex){
        double real = this.real * complex.real - this.imaginary * complex.imaginary;
        double imaginary = this.real * complex.imaginary + this.imaginary * complex.real;
        return  new Complex(real, imaginary);
    }

    public String toString(){
        return this.real + "+" + this.imaginary + "i";
    }

}

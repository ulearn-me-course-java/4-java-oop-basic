package com.example.task03;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }

    public ComplexNumber(double real){
        this(real, 0);
    }

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber complex){
        return new ComplexNumber(this.real + complex.getReal(),
                this.imaginary + complex.getImaginary());
    }

    public ComplexNumber subtract(ComplexNumber complex){
        return new ComplexNumber(this.real - complex.getReal(),
                this.imaginary - complex.getImaginary());
    }

    public String toString(){
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}

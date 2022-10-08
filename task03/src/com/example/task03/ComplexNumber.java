package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber Add(ComplexNumber cn){
        return new ComplexNumber(this.real + cn.getReal(), this.imaginary + cn.getImaginary());
    }
    public ComplexNumber Mul(ComplexNumber cn){
        return new ComplexNumber((this.real * cn.getReal() - this.imaginary * cn.getImaginary()),
                this.real * cn.getImaginary() + this.imaginary * cn.getReal());
    }
    public String toString(){
        return String.format("%s + %s*i", this.real, this.imaginary);
    }
}

package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imag;
    }

    public ComplexNumber add(ComplexNumber z){
        return new ComplexNumber(this.real+z.real, this.imag + z.imag);
    }

    public ComplexNumber multiply(ComplexNumber z){
        return new ComplexNumber(this.real *z.real - this.imag * z.imag,
                this.real*z.imag + this.imag * z.real);
    }

    String tostring() {
        return real+" + ("+imag+")i";
    }
}

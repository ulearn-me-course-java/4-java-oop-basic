package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber complexNumber){
        return new ComplexNumber(this.real + complexNumber.real, this.imaginary + complexNumber.imaginary);
    }
    public ComplexNumber mul(ComplexNumber complexNumber){
        return new ComplexNumber(this.real * complexNumber.real - this.imaginary * complexNumber.imaginary,
                this.real * complexNumber.imaginary + this.imaginary * complexNumber.real);
    }
    public String toString(){
        if(imaginary >= 0) {
            return String.format("z = %f + %f * i", real, imaginary);
        }
        return String.format("z = %f -%f * i", real, imaginary);
    }
}

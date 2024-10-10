package com.example.task03;

public final class ComplexNumber {
    final double real;
    final double imaginary;
    ComplexNumber (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public String toString(){
        if (real == 0)
            return this.imaginary + "i";
        if (imaginary == 0)
            return Double.toString(this.real);
        if (imaginary > 0)
            return String.format("%f + %fi",this.real, this.imaginary);
        else
            return String.format("%f - %fi",this.real, -this.imaginary);
    }

    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2){
        double real = num1.real + num2.real;
        double img = num1.imaginary + num2.imaginary;
        return new ComplexNumber(real, img);
    }
    public static  ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2){
        double real = num1.real * num2.real - num1.imaginary * num2.imaginary;
        double img = num1.imaginary * num2.real + num1.real * num2.imaginary;
        return new ComplexNumber(real, img);
    }

}

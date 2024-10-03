package com.example.task03;

public class ComplexNumber {
    private double real_part;
    private double imaginary_part;

    public ComplexNumber(double real_part, double imaginary_part){
        this.real_part = real_part;
        this.imaginary_part = imaginary_part;
    }

    static ComplexNumber Sum(ComplexNumber num1, ComplexNumber num2){
        double real_part = num1.real_part  + num2.real_part;
        double imaginary_part = num1.imaginary_part + num2.imaginary_part;
        return new ComplexNumber(real_part, imaginary_part);
    }

//    (a1 + b1i) (a2 + b2i) = (a1a2 - b1b2) + (a1b2 - a2b1) i
    static ComplexNumber Mul(ComplexNumber num1, ComplexNumber num2){
        double real_part = (num1.real_part  * num2.real_part) - (num1.imaginary_part * num2.imaginary_part);
        double imaginary_part = (num1.real_part * num2.imaginary_part) - (num2.real_part * num1.imaginary_part);
        return new ComplexNumber(real_part, imaginary_part);
    }

    public String ToString(){
        return this.real_part + " + " + this.imaginary_part + 'i';
    }
}

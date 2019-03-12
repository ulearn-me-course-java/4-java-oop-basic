package com.example.task03;

public class ComplexNumber {

    private final double real;
    private final double imagine;

    ComplexNumber(){
        real = 0;
        imagine = 0;
    }

    ComplexNumber(double real){
        this.real = real;
        imagine = 0;
    }

    ComplexNumber(double real, double imagine){
        this.real = real;
        this.imagine = imagine;
    }

    public static ComplexNumber Add(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.real + b.real, a.imagine + b.imagine);
    }

    @Override
    public String toString() {
        return real + " + (" + imagine + ")i";
    }

    public static ComplexNumber Multyply(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.real * b.real - a.imagine * b.imagine,
                a.real * b.imagine + a.imagine * b.real);
    }
}

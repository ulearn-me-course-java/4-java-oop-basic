package com.example.task03;

public class ComplexNumber {
    private final double re;
    private final double im;
    String num;

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
        num = String.format("%s+%si", re, im);
    }

    public double getRe(){
        return re;
    }

    public double getIm(){
        return im;
    }

    public static ComplexNumber sum(ComplexNumber num1, ComplexNumber num2){
        double newRe = num1.re + num2.re;
        double newIm = num1.im + num2.im;
        return new ComplexNumber(newRe, newIm);
    }

    public static ComplexNumber miltipl(ComplexNumber num1, ComplexNumber num2){
        double newRe = num1.re * num2.re - num1.im * num2.im;
        double newIm = num1.im * num2.re + num1.re * num2.im;
        return new ComplexNumber(newRe, newIm);
    }
}

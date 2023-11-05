package com.example.task03;

public class ComplexNumber {
    private double re;

    private double im;

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    public static ComplexNumber sum(ComplexNumber n1, ComplexNumber n2){
        return new ComplexNumber(n1.getRe() + n2.getRe(), n1.getIm() + n2.getIm());
    }

    public static ComplexNumber mult(ComplexNumber n1, ComplexNumber n2){
        return new ComplexNumber(n1.getRe() * n2.getRe() - n1.getIm() * n2.getIm(), n1.getRe() * n2.getIm() + n1.getIm() * n2.getRe());
    }
    @Override
    public String toString(){
        return this.re + " + " + im + "i";
    }

    public double getRe(){
        return re;
    }

    public void setRe(double re){
        this.re = re;
    }

    public double getIm(){
        return im;
    }

    public void setIm(double im){
        this.im = im;
    }
}

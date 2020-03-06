package com.example.task03;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(b.realPart + a.realPart, b.imaginaryPart + a.imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(b.realPart * a.realPart - b.imaginaryPart * a.imaginaryPart,
                b.realPart * a.imaginaryPart + a.realPart * b.imaginaryPart);
    }

    public String toString(){
        return String.format("%s + i * %s", realPart, imaginaryPart);
    }
}

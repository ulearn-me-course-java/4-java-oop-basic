package com.example.task03;

public class ComplexNumber {

    private double imaginaryPart;
    private double realPart;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public static ComplexNumber add(ComplexNumber first, ComplexNumber second){
        return new ComplexNumber(first.realPart + second.realPart,
                first.imaginaryPart + second.imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber first, ComplexNumber second){
        return new ComplexNumber(first.realPart * second.realPart - first.imaginaryPart * second.imaginaryPart,
                first.realPart * second.imaginaryPart + second.realPart * first.imaginaryPart);
    }
    @Override
    public String toString() {
        if(imaginaryPart > 0){
            return "" + realPart + "+" + imaginaryPart + "*i";
        }
        else {
            return "" + realPart + imaginaryPart + "*i";
        }
    }

}

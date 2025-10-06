package com.example.task03;

public class ComplexNumber {
    final private double realPart;
    final private double imaginaryPart;

    public double getRealPart(){
        return realPart;
    }

    public double getImaginaryPart(){
        return imaginaryPart;
    }

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber sumComplexNum(ComplexNumber complexNum){
        double newRealPart = realPart + complexNum.realPart;
        double newImaginaryPart = imaginaryPart + complexNum.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiplyComplexNum(ComplexNumber complexNum){
        double newRealPart = realPart * complexNum.realPart - imaginaryPart * complexNum.imaginaryPart;
        double newImaginaryPart = realPart * complexNum.imaginaryPart + complexNum.realPart * imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public String toString(){
        if (imaginaryPart < 0){
            return realPart + " - " + (-imaginaryPart) + "i";
        }

        return realPart + " + " + imaginaryPart + "i";
    }
}

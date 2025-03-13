package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public void setRealPart(double newRealPart){
        this.realPart = newRealPart;
    }

    public double getImaginaryPart(){
        return imaginaryPart;
    }

    public void setImaginaryPart(double newImaginaryPart){
        this.imaginaryPart = newImaginaryPart;
    }

    public ComplexNumber add(ComplexNumber otherNumber){
        return new ComplexNumber(realPart + otherNumber.realPart, imaginaryPart + otherNumber.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber otherNumber){
        double newRealPart = (realPart * otherNumber.realPart) - (imaginaryPart * otherNumber.imaginaryPart);
        double newImaginaryPart = (imaginaryPart * otherNumber.realPart) + (realPart * otherNumber.imaginaryPart);
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public String toString(){
        if (imaginaryPart == 0) {
            return String.format("%.2f", realPart);
        } else if (imaginaryPart > 0) {
            return String.format("%.2f + %.2fi", realPart, imaginaryPart);
        }
        return String.format("%.2f - %.2fi", realPart, -imaginaryPart);
    }
}

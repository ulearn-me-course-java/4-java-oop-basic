package com.example.task03;

public class ComplexNumber {
    private double realPart; //a
    private double imaginaryPart; // b

    public void setRealPart(double realPart){
        this.realPart = realPart;
    }
    public double getRealPart(){
        return realPart;
    }

    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public ComplexNumber(){
        this(0,0);
    }

    public ComplexNumber sumComplexNumbers(ComplexNumber number){
        return new ComplexNumber(realPart + number.realPart, imaginaryPart + number.imaginaryPart);
    }
    public ComplexNumber multiplyComplexNumbers(ComplexNumber number){
        return new ComplexNumber(realPart * number.realPart - imaginaryPart * number.imaginaryPart,
                imaginaryPart * number.realPart + realPart * number.imaginaryPart);
    }

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public String toString(){
        String numberToString = String.format("(%f; %f)", realPart, imaginaryPart);
        return numberToString;
    }
}

package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public void setRealPart(double r){
        realPart = r;
    }

    public double getRealPart(){
        return getRealPart();
    }

    public void setImaginaryPart(double i){
        imaginaryPart = i;
    }

    public  double getImaginaryPart(){
        return imaginaryPart;
    }

    public ComplexNumber(){}

    public ComplexNumber(double r, double i) {
        realPart = r;
        imaginaryPart = i;
    }

    ComplexNumber add(ComplexNumber number){
        return new ComplexNumber(realPart + number.realPart, imaginaryPart + number.imaginaryPart);
    }

    ComplexNumber multiply(ComplexNumber number){
        double a = realPart * number.realPart - imaginaryPart * number.imaginaryPart;
        double b = imaginaryPart * number.realPart + realPart * number.imaginaryPart;
        return  new ComplexNumber(a, b);
    }

    public String toString(){
        if(imaginaryPart > 0)
            return realPart + "+" + imaginaryPart + "i";
        return  realPart + imaginaryPart + "i";
    }

}

package com.example.task03;

import java.text.DecimalFormat;

class ComplexNumber {
    private double realPartOfNumber;
    private double imaginaryPartOfNumber;
    public double getRealPartOfNumber() {
        return realPartOfNumber;
    }
    public void setRealPartOfNumber(double realPartOfNumber) {
        this.realPartOfNumber = realPartOfNumber;
    }
    public double getImaginaryPartOfNumber() {
        return imaginaryPartOfNumber;
    }
    public void setImaginaryPartOfNumber(double imaginaryPartOfNumber) {
        this.imaginaryPartOfNumber = imaginaryPartOfNumber;
    }

    public ComplexNumber(double real, double illusory) {
        this.realPartOfNumber = real;
        this.imaginaryPartOfNumber = illusory;
    }

    public ComplexNumber sum(ComplexNumber secondComplexNumber) {
        return new ComplexNumber(secondComplexNumber.realPartOfNumber + realPartOfNumber, secondComplexNumber.imaginaryPartOfNumber + imaginaryPartOfNumber);
    }

    public ComplexNumber multiply(ComplexNumber secondComplexNumber) {
        return new ComplexNumber(secondComplexNumber.realPartOfNumber * realPartOfNumber - secondComplexNumber.imaginaryPartOfNumber * imaginaryPartOfNumber,
                secondComplexNumber.realPartOfNumber * imaginaryPartOfNumber + secondComplexNumber.imaginaryPartOfNumber * realPartOfNumber);
    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String s = decimalFormat.format(realPartOfNumber);
        if (imaginaryPartOfNumber >0){
            s=s+" + "+decimalFormat.format(imaginaryPartOfNumber)+"i";
        }else if(imaginaryPartOfNumber <0){
            s=s+" - "+decimalFormat.format(Math.abs(imaginaryPartOfNumber))+"i";
        }
        return s;
    }
}
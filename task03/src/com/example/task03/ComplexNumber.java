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

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(number.realPartOfNumber + realPartOfNumber, number.imaginaryPartOfNumber + imaginaryPartOfNumber);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(number.realPartOfNumber * realPartOfNumber - number.imaginaryPartOfNumber * imaginaryPartOfNumber,
                number.realPartOfNumber * imaginaryPartOfNumber + number.imaginaryPartOfNumber * realPartOfNumber);
    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String s = decimalFormat.format(realPartOfNumber);
        if (imaginaryPartOfNumber >0){
            s=s+" + "+decimalFormat.format(imaginaryPartOfNumber)+"i";
        }else if(imaginaryPartOfNumber <0){
            s=s+" - "+decimalFormat.format(imaginaryPartOfNumber)+"i";
        }
        return s;
    }
}
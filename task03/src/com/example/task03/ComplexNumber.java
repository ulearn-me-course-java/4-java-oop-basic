package com.example.task03;

public class ComplexNumber {

    double realPart;
    double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    ComplexNumber sum(ComplexNumber num){
        return new ComplexNumber(realPart +num.realPart, imaginaryPart +num.imaginaryPart);
    }

    ComplexNumber multiply(ComplexNumber num){
        return new ComplexNumber(realPart *num.realPart - imaginaryPart *num.imaginaryPart, realPart *num.imaginaryPart + imaginaryPart *num.realPart);
    }
    void print(ComplexNumber num){
        System.out.printf("%s+%s*i\n",num.realPart,num.imaginaryPart);
    }
}

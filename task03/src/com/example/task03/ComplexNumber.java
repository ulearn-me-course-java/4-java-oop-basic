package com.example.task03;

public class ComplexNumber {
    double realPart;
    double imaginaryPart;

    ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    ComplexNumber Sum(ComplexNumber otherNumber){
        double reTemp = realPart + otherNumber.realPart;
        double imTemp = imaginaryPart + otherNumber.imaginaryPart;

        return new ComplexNumber(reTemp, imTemp);
    }

    ComplexNumber Multiply(ComplexNumber otherNumber){
        double reTemp = realPart * otherNumber.realPart + (imaginaryPart * otherNumber.imaginaryPart) * -1;
        double imTemp = imaginaryPart * otherNumber.realPart + realPart * otherNumber.imaginaryPart;

        return new ComplexNumber(reTemp, imTemp);
    }
}

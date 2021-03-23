package com.example.task03;

public class ComplexNumber {
    int realPart;
    int imaginaryPart;

    public ComplexNumber(int realPart, int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    ComplexNumber sum(ComplexNumber num) {
        return new ComplexNumber(realPart + num.realPart, imaginaryPart + num.imaginaryPart);
    }

    ComplexNumber multiply(ComplexNumber num) {
        return new ComplexNumber(realPart * num.realPart - imaginaryPart * num.imaginaryPart,
                imaginaryPart * num.realPart + realPart * num.imaginaryPart);
    }
}
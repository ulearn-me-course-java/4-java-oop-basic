package com.example.task03;

public class complexNumber {
    double realPart;
    double imaganaryPart;

    complexNumber(double real, double imaganary) {
        realPart = real;
        imaganaryPart = imaganary;
    }

    public complexNumber sum(complexNumber cN) {
        return new complexNumber(cN.realPart + realPart, cN.imaganaryPart + imaganaryPart);
    }

    public complexNumber mul(complexNumber cN) {
        return new complexNumber(cN.realPart * realPart - cN.imaganaryPart * imaganaryPart, cN.realPart * realPart + cN.imaganaryPart * imaganaryPart);
    }

}

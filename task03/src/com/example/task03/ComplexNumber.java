package com.example.task03;

public class ComplexNumber {
    private double realPart, imaginaryPart;

    public ComplexNumber(double realPartOf, double imaginaryPart) {
        this.realPart = realPartOf;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(realPart + number.realPart, imaginaryPart + number.imaginaryPart);
    }

    public ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(realPart * number.realPart - imaginaryPart * number.imaginaryPart,
                                 imaginaryPart * number.realPart - realPart * number.imaginaryPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return realPart + (imaginaryPart < 0
                           ? imaginaryPart + "i"
                           : imaginaryPart == 0
                             ? ""
                             : "+" + imaginaryPart + "i");
    }
}

package com.example.task03;

public class ComplexNumber {
     private final double realPart;
     private final double imaginaryPart;

     public ComplexNumber(double realPart, double imaginaryPart){
         this.realPart = realPart;
         this.imaginaryPart = imaginaryPart;
     }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber){
         double newReal = this.realPart + complexNumber.realPart;
         double newImaginary = this.imaginaryPart + complexNumber.imaginaryPart;
         return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
         double newReal = this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart;
         double newImaginary = this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart;
         return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + "+" + imaginaryPart + "i";
        }
        return realPart + "-" + (-imaginaryPart) + "i";
    }

}

package com.example.task03;

public class ComplexNumber {
    private double imaginaryPart;
    private double realPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
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

    ComplexNumber add(ComplexNumber number) {
        double newReal = realPart + number.realPart;
        double newimaginaryPart = imaginaryPart + number.imaginaryPart;
        return new ComplexNumber(newReal, newimaginaryPart);
    }

    ComplexNumber multiply(ComplexNumber number) {
        double newReal = realPart * number.realPart - imaginaryPart * number.imaginaryPart;
        double newimaginaryPart = imaginaryPart * number.realPart + realPart * number.imaginaryPart;
        return new ComplexNumber(newReal, newimaginaryPart);
    }

    public void print() {
        if (imaginaryPart==0)
            System.out.println(realPart);
        else
        System.out.println(realPart + (imaginaryPart > 0 ? " + " : " - ") + Math.abs(imaginaryPart) + "i");
    }
}

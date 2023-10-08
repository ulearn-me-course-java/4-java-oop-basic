package com.example.task03;

public class ComplexNum {
    private double realPart;
    private double imaginaryPart;

    public ComplexNum(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNum add(ComplexNum other) {
        double newRealPart = this.getRealPart() + other.getRealPart();
        double newImaginaryPart = this.getImaginaryPart() + other.getImaginaryPart();
        return new ComplexNum(newRealPart, newImaginaryPart);
    }

    public ComplexNum multiply(ComplexNum other) {
        double newRealPart = this.getRealPart() * other.getRealPart() - this.getImaginaryPart() * other.getImaginaryPart();
        double newImaginaryPart = this.getRealPart() * other.getImaginaryPart() + this.getImaginaryPart() * other.getRealPart();
        return new ComplexNum(newRealPart, newImaginaryPart);
    }

    @Override
    public String toString() {
        return getRealPart() + " + " + getImaginaryPart() + "i";
    }
}

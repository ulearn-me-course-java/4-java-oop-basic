package com.example.task03;

public class ComplexNumber {

    double r;
    double angle;
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double imgnPrt) {
        this.realPart = real;
        this.imaginaryPart = imgnPrt;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double number) {
        this.realPart = number;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double number) {
        this.imaginaryPart = number;
    }

    public void subtract(ComplexNumber cn) {
        this.realPart -= cn.realPart;
        this.imaginaryPart -= cn.imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber cn) {
        double a = this.realPart + cn.realPart;
        double b = this.imaginaryPart + cn.imaginaryPart;
        return new ComplexNumber(a, b);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        double a = this.realPart * complexNumber.getRealPart() - this.imaginaryPart * complexNumber.getImaginaryPart();
        double b = this.realPart * complexNumber.getImaginaryPart() + this.imaginaryPart * complexNumber.getRealPart();
        return new ComplexNumber(a, b);
    }

    private void toTrigonometryForm() {
        this.r = Math.sqrt(Math.pow(this.realPart, 2) + Math.pow(this.imaginaryPart, 2));
        this.angle = Math.acos(this.realPart / this.r);
    }

    private void toNormalForm() {
        this.realPart = r * Math.cos(this.angle);
        this.imaginaryPart = r * Math.sin(this.angle);
    }

    public void pow(int n) {
        toTrigonometryForm();
        this.r = Math.pow(r, n);
        this.angle = (angle * n) % (2 * Math.PI);
        toNormalForm();
    }


    public String toString() {
        return String.format("%d+%di", this.realPart, this.imaginaryPart);
    }

    public String toStringInTrigonometryForm() {
        toTrigonometryForm();
        return String.format("%.3f*(cos(%.3f)+i*sin(%.3f)", this.r, this.angle, this.angle);
    }
}
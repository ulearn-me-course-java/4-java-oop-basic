package com.example.task03;

public class ComplexNumber {
    private double Re;
    private double Im;

    public double getRe() {
        return this.Re;
    }

    public double getIm() {
        return this.Im;
    }

    public void setRe(double value) {
        this.Re = value;
    }

    public void setIm(double value) {
        this.Im = value;
    }

    public ComplexNumber() {
        this.setRe(0);
        this.setIm(0);
    }

    public ComplexNumber(double reValue, double imValue) {
        this.setRe(reValue);
        this.setIm(imValue);
    }

    public static ComplexNumber addition(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.Re + b.Re, a.Im + b.Im);
    }

    public static ComplexNumber multiplication(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.Re * b.Re - a.Im * b.Im, a.Re * b.Im + a.Im * b.Re);
    }

    public String toString() {
        return this.getRe() + " + " + this.getIm() + "i";
    }
}

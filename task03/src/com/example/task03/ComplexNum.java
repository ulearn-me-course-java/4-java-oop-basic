package com.example.task03;

public class ComplexNum {
    private double real;
    private double imag;
    public ComplexNum(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }

    public ComplexNum add(ComplexNum complexNum) {
        double newReal = this.real + complexNum.getReal();
        double newImag = this.imag + complexNum.getImag();
        return new ComplexNum(newReal, newImag);
    }

    public ComplexNum multiply(ComplexNum complexNum) {
        double newReal = real * complexNum.getReal() - imag * complexNum.getImag();
        double newImag = real * complexNum.getImag() + imag * complexNum.getReal();
        return new ComplexNum(newReal, newImag);
    }

    public String toString() {
        return real + " + " + imag + "i";
    }
}

package com.example.task03;

public class ComplexNumber {
    private double real;
    private double im;

    public ComplexNumber(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public void setRealPart(double real) {
        this.real = real;
    }

    public void getImaginaryPart(double im) {
        this.im = im;
    }

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return im;
    }

    public String toString() {
        return String.format("%f + %f i", real, im);
    }

    ComplexNumber add(ComplexNumber num) {
        double addReal = real + num.real;
        double addIm = im + num.im;

        return new ComplexNumber(addReal, addIm);
    }

    ComplexNumber multiply(ComplexNumber num) {
        double multReal = real * num.real - im * num.im;
        double multIm = real * num.im + im * num.real;

        return new ComplexNumber(multReal, multIm);
    }
}

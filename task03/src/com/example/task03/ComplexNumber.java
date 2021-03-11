package com.example.task03;

public class ComplexNumber {
    private double real;
    private double realWithIm;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getRealWithIm() {
        return realWithIm;
    }

    public void setRealWithIm(double realWithIm) {
        this.realWithIm = realWithIm;
    }

    public ComplexNumber(double real, double realWithIm) {
        this.real = real;
        this.realWithIm = realWithIm;
    }

    public ComplexNumber getSum(ComplexNumber c) {
        return new ComplexNumber(real + c.getReal(), realWithIm + c.getRealWithIm());
    }

    public ComplexNumber getProduct(ComplexNumber c) {
        double cReal = c.getReal();
        double cRealWithIm = c.getRealWithIm();
        return new ComplexNumber(real * cReal - realWithIm * cRealWithIm,
                            real* cRealWithIm + realWithIm * cReal);
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", realWithIm=" + realWithIm +
                '}';
    }
}

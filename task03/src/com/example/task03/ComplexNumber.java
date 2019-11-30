package com.example.task03;

public class ComplexNumber {
    double re;
    double im;

    public ComplexNumber(double re, double im) {
        setRe(re);
        setIm(im);
    }

    public ComplexNumber() {
        setRe(0);
        setIm(0);
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.re + b.re, a.im + b.im);
    }

    public static ComplexNumber mul(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.re * b.re - a.im * b.im, a.re * b.im + a.im * b.re);
    }

    public String toString() {
        return String.format("%.1f + %.1fi", re, im);
    }

    public void print() {
        System.out.println(toString());
    }
}

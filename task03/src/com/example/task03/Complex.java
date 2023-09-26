package com.example.task03;

public class Complex {
    private final double re;

    public double getRe() {
        return re;
    }

    private final double im;

    public double getIm() {
        return im;
    }
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex complex) {
        return new Complex(this.re + complex.re, this.im + complex.im);
    }

    public Complex mul(Complex complex) {
        return new Complex(re * complex.re - im * complex.im,
                re * complex.im + im * complex.re);
    }
}
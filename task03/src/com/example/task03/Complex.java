package com.example.task03;

public class Complex {

    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex sum(Complex cn2) {
        Complex cn1 = this;
        return new Complex(cn1.getRe() + cn2.getRe(), cn1.getIm() + cn2.getIm());
    }

    public Complex multiply(Complex cn2) {
        Complex cn1 = this;
        return new Complex(cn1.getRe() * cn2.getRe() - cn1.getIm() * cn2.getIm(), cn1.getRe() * cn2.getIm() + cn1.getIm() * cn2.getRe());
    }
}

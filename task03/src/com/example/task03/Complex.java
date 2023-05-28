package com.example.task03;

public class Complex {
    private final double Real;
    private final double Imaginary;

    public double getReal() {
        return Real;
    }

    public double getImaginary() {
        return Imaginary;
    }

    public Complex(double re, double im) {
        this.Real = re;
        this.Imaginary = im;
    }

    public Complex Add(Complex term) {
        return new Complex(this.Real + term.Real, this.Imaginary + term.Imaginary);
    }

    public Complex Multiply(Complex term) {
        return new Complex(this.Real * term.Real - this.Imaginary * term.Imaginary,
                this.Real * term.Imaginary + this.Imaginary * term.Real);
    }

    @Override
    public String toString() {
        return String.format("%s real, %s imaginary", this.Real, this.Imaginary);
    }
}

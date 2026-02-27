package com.example.task03;

public class Complex {
    final private double real;
    final private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    };

    public double getReal() {
        return real;
    };
    public double getImag() {
        return imag;
    };

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    };

    public Complex multiply(Complex other) {
        double real = (this.real * other.real) - (this.imag * other.imag);
        double imag = (this.real * other.imag) + (other.real * this.imag);

        return new Complex(real, imag);
    };

    @Override
    public String toString() {
        String sign = "+";
        if (imag < 0)
            sign = "-";

        return String.format("%.2f%s%.2fi", real, sign, Math.abs(imag));
    };
}

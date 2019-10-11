package com.example.task03;

public class Complex {
    double Re;
    double Im;

    public double getRe() {
        return Re;
    }

    public double getIm() {
        return Im;
    }

    public void setRe(double re) {
        Re = re;
    }

    public void setIm(double im) {
        Im = im;
    }

    Complex() {
        this.setRe(0);
        this.setIm(0);
    }

    Complex(double Re, double Im) {
        this.setRe(Re);
        this.setIm(Im);
    }

    public static Complex sum(Complex value1, Complex value2) {
        return new Complex(value1.Re + value2.Re, value1.Im + value2.Im);
    }

    public static Complex mul(Complex value1, Complex value2) {
        return new Complex(value1.Re * value2.Re - value1.Im * value2.Im, value1.Re * value2.Im + value1.Im * value2.Re);
    }

    public String toString() {
        return String.format("%.1f + %.1fi", Re, Im);
    }
}

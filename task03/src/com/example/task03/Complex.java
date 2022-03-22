package com.example.task03;

public class Complex {
    private int real;
    private int imagine;

    public Complex(int real, int imagine) {
        this.imagine = imagine;
        this.real = real;
    }

    Complex sum(Complex num) {
        return new Complex(real + num.real,
                imagine + num.imagine);
    }

    Complex multiply(Complex num) {
        return new Complex(real * num.real - imagine * num.imagine,
                imagine * num.real + real * num.imagine);
    }

    public int getReal() {
        return real;
    }

    public int getImagine() {
        return imagine;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImagine(int imagine) {
        this.imagine = imagine;
    }
}

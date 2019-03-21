package com.example.task03;

public class ComplexNumber {
    private float re = 0;
    private float im = 0;

    public ComplexNumber(float realPartOf, float imaginaryPart) {
        this.re = realPartOf;
        this.im = imaginaryPart;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(this.re + number.re, this.im + number.im);
    }

    public ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(this.re * number.re - this.im * number.im, this.im * number.re - this.re * number.im);
    }

    public String toString() {
        return re + ((im < 0) ? im + "i" : "+" + im + "i");
    }
}
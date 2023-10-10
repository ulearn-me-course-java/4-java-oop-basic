package com.example.task03;

public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber cNum) {
        return new ComplexNumber(this.a + cNum.a, this.b + cNum.b);
    }

    public ComplexNumber multiply(ComplexNumber cNum) {
        return new ComplexNumber(this.a * cNum.a - this.b * cNum.b, this.b * cNum.a + this.a * cNum.b);
    }

    public String toString() {
        return this.a + "+" + this.b + "i";
    }
}

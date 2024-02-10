package com.example.task03;

public class ComplexNumber {
    private double a1;
    private double a2;

    public ComplexNumber(double a, double b) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.a1 + num.a1, this.a1 + num.a2);
    }

    public ComplexNumber multiply(ComplexNumber num) {
        return new ComplexNumber(this.a1 * num.a1 - this.a2 * num.a2, this.a2 * num.a1 + this.a1 * num.a2);
    }

    public String toString() {
        return this.a1 + "+" + this.a2 + "i";
    }
}

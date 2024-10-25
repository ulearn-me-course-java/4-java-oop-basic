package com.example.task03;

public class ComplexNumber {
    int realPart, imaginaryPart;

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public ComplexNumber() {}

    public ComplexNumber add(ComplexNumber other) {
        return (new ComplexNumber(this.realPart + other.realPart, this.imaginaryPart + other.imaginaryPart));
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return (new ComplexNumber((this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart),
                (this.imaginaryPart * other.realPart + this.realPart * other.imaginaryPart)));
    }

    public String toString() {
        if (imaginaryPart < 0) return String.format("%d - %di", realPart, imaginaryPart * (-1));

        return String.format("%d + %di", realPart, imaginaryPart);
    }
}

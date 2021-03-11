package com.example.task03;

public class ComplexNumber {
    int real;
    int imagine;

    public ComplexNumber(int real, int imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    ComplexNumber sum(ComplexNumber n) {
        return new ComplexNumber(real + n.real, imagine + n.imagine);
    }

    ComplexNumber multiply(ComplexNumber n) {
        return new ComplexNumber(real * n.real - imagine * n.imagine, imagine * n.real + real * n.imagine);
    }
}

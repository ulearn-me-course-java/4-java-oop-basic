package com.example.task03;

public class ComplexNumber {
    int real;
    int imagine;

    public ComplexNumber(int real, int imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    ComplexNumber sum(ComplexNumber num) {
        return new ComplexNumber(real + num.real, imagine + num.imagine);
    }

    ComplexNumber multiply(ComplexNumber num) {
        return new ComplexNumber(real * num.real - imagine * num.imagine, imagine * num.real + real * num.imagine);
    }
}

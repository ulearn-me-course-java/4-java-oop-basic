package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(2, 1);
        ComplexNumber complexNumber2 = new ComplexNumber(0, -1);
        ComplexNumber sum = complexNumber1.sum(complexNumber2);
        ComplexNumber product = complexNumber1.multiply(complexNumber2);
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(0, 3);
        ComplexNumber sum = c1.sum(c2);
        ComplexNumber product = c1.multiply(c2);
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 0);
        ComplexNumber b = new ComplexNumber(5, 0);
        ComplexNumber sum = a.sum(b);
        ComplexNumber mul = a.mul(b);
    }
}

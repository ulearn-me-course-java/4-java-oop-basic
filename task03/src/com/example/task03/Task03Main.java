package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, -1);
        ComplexNumber c2 = new ComplexNumber(3, 6);

        ComplexNumber cSum = c1.Sum(c2);
        ComplexNumber cMul = c1.Multiply(c2);
    }
}

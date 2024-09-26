package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(1., 2.);
        ComplexNumber complex2 = new ComplexNumber(3., 4.);
        ComplexNumber add = complex1.Add(complex2);
        ComplexNumber multiply = complex1.Multiply(complex2);
        System.out.println(add);
        System.out.println(multiply);
    }
}

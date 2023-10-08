package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(2.8, 4.2);
        ComplexNumber complex2 = new ComplexNumber(2, -5);

        System.out.println(String.format("(%s) + (%s) = %s", complex1, complex2, complex1.sum(complex2)));
        System.out.println(String.format("(%s) * (%s) = %s", complex1, complex2, complex1.multiply(complex2)));
    }
}

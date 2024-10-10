package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.5, -2);
        ComplexNumber b = new ComplexNumber(4.2, 2);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("a + b: " + a.add(b));
        System.out.println("a * b: " + a.multiply(b));
    }
}

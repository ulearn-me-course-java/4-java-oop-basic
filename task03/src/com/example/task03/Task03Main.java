package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, -6);
        ComplexNumber c2 = new ComplexNumber(-3, 2);

        ComplexNumber c0 = c1.add(c2);
        ComplexNumber c = c1.multiply(c2);

        System.out.println(c0.toString());
        System.out.println(c.toString());
    }
}

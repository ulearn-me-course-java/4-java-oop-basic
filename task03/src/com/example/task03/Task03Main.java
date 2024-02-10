package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a1 = new ComplexNumber(1.5f, 2);
        ComplexNumber a2 = new ComplexNumber(5, 2.55);

        System.out.println("addition " + a1.add(a2));
        System.out.println("multiply " + a1.multiply(a2));
    }
}

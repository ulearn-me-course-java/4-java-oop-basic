package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.5, 2);
        ComplexNumber b = new ComplexNumber(5, 2.55);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

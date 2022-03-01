package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(2, 2);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

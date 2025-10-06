package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);
        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " * " + b + " = " + a.mul(b));
    }
}

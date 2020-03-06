package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(4, 5);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(ComplexNumber.add(a, b));
        System.out.println(ComplexNumber.multiply(a,b));
    }
}

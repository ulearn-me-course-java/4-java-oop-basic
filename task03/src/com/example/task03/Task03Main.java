package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(12, -33);
        ComplexNumber b = new ComplexNumber(14, 2);

        System.out.println(ComplexNumber.sum(a, b));
        System.out.println(ComplexNumber.multiply(a, b));
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(1, -2);
        ComplexNumber second = new ComplexNumber(3, 2);
        System.out.println(first.add(second));
        System.out.println(first.multiply(second));
        System.out.println(first);
        System.out.println(second);
    }
}

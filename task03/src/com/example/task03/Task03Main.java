package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(6.24, -8);
        ComplexNumber second = new ComplexNumber(52, 17);
        System.out.println(first.add(second));
        System.out.println(second.multiply(first));
        System.out.println(first);
        System.out.println(second);
    }
}

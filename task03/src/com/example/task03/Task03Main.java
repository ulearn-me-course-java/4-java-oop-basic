package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1,2);
        ComplexNumber c2 = new ComplexNumber(3,4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.add(c2));
        System.out.println(c1.multiply(c2));
    }
}

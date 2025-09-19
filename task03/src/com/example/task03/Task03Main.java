package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(0, 3);
        ComplexNumber z2 = new ComplexNumber(1, -4);
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z1.add(z2));
        System.out.println(z1.multiply(z1));
    }
}

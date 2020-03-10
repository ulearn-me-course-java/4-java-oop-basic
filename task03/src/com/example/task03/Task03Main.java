package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(7, 3);
        ComplexNumber z2 = new ComplexNumber(5, -8);

        System.out.println(z1.sum(z2));
        System.out.println(z1.multiply(z2));
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(3.4f,-6f);
        ComplexNumber z2 = new ComplexNumber(8.6f,11.1f);

        System.out.println(z1.add(z2));
        System.out.println(z1.multiply(z2));

        System.out.println(z1.modulus());
    }
}

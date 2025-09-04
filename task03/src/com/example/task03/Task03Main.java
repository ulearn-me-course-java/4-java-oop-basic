package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, 3);
        ComplexNumber z2 = new ComplexNumber(1, -4);

        ComplexNumber sum = z1.add(z2);
        ComplexNumber product = z1.multiply(z2);

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(sum);
        System.out.println(product);
    }
}

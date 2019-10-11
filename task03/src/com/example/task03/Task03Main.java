package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(2, 5);
        Complex b = new Complex(2, 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Complex.sum(a, b));
        System.out.println(Complex.mul(a, b));
    }
}

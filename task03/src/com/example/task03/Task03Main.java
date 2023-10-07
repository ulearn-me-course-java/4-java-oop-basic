package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(5, Math.sqrt(2));
        Complex complex2 = new Complex(2, Math.sqrt(3));
        System.out.println(complex1.sum(complex2));
        System.out.println(complex1.multiply(complex2));
    }
}

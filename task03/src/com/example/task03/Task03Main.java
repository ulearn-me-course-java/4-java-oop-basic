package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(10.876, 8);
        Complex complex2 = new Complex(23.1, 2.65);

        System.out.println(complex1.toString());
        System.out.println(complex2.toString());

        System.out.println(complex1.add(complex2).toString());
        System.out.println(complex1.multiply(complex2).toString());
    }
}

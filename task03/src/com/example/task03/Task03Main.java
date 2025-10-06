package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(0, 0);
        Complex c2 = new Complex(6, -2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.add(c2));
        System.out.println(c1.multiply(c1));
    }
}

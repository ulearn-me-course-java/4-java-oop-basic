package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(1, 3);
        Complex z2 = new Complex(4, -5);
        System.out.println(z1.add(z2).toString());
    }
}

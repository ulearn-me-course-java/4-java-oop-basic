package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(3, 10);

        System.out.println(a.add(b).print());
        System.out.println(a.multiply(b).print());
    }
}

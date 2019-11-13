package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, -1);
        System.out.println(a);
        Complex b = new Complex(3,4);

        System.out.println(a.add(b));
        System.out.println(a.mul(b));
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1,2);
        Complex b = new Complex (2, 3);
        System.out.println(Complex.sum(a,b));
        System.out.println(Complex.power(a,b));
    }
}

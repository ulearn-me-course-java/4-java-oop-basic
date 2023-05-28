package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1., 2.);
        Complex complex2 = new Complex(3., 4.);
        Complex add = complex1.Add(complex2);
        Complex multiply = complex1.Multiply(complex2);
        System.out.println(add);
        System.out.println(multiply);
    }
}

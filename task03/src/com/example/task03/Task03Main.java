package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(6.2,5);
        Complex b = new Complex(1, 2);
        Complex c = a.Add(b);
        Complex d = a.Mul(b);
        System.out.println(c.GetComplex());
        System.out.println(d.GetComplex());
    }
}

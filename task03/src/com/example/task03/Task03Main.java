package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(5, 6);
        ComplexNumber d = new ComplexNumber(5, 6);
        ComplexNumber a = c.getSum(d);
        ComplexNumber b = c.getProduct(d);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(5,6);
        Complex complex2 = new Complex(7,8);
        System.out.println(complex1.multy(complex2).toString());
        System.out.println(complex1.summ(complex2).toString());

    }
}

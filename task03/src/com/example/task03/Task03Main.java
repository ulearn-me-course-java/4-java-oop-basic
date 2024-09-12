package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1=new Complex(8,5);
        Complex c2=new Complex(10,-5);

        System.out.println(c1.sum(c2));
        System.out.println(c1.multiply(c2));
    }
}

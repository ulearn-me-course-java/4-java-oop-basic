package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum a = new ComplexNum(1, 2);
        ComplexNum b = new ComplexNum(3, 4);
        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " * " + b + " = " + a.mul(b));
    }
}
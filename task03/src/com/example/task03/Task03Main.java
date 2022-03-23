package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(5, -3);
        ComplexNumber second = new ComplexNumber(-2, 4);

        ComplexNumber sum = first.add(second);
        ComplexNumber mul = first.multiply(second);

        System.out.println(sum.toString());
        System.out.println(mul.toString());
    }
}

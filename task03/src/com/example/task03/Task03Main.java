package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(1, 3);
        ComplexNumber second = new ComplexNumber(4, -2);

        ComplexNumber sum = first.sum(second);
        ComplexNumber mult = first.multiplicate(second);

        System.out.println("sum : " + sum);
        System.out.println("multiplication : " + mult);
    }
}

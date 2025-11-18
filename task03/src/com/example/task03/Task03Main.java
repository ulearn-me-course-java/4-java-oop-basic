package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers complex1 = new ComplexNumbers(0,2);
        ComplexNumbers complex2 = new ComplexNumbers(1,-4);

        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.add(complex2));
        System.out.println(complex1.product(complex2));
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber cm1 = new ComplexNumber(10, 4);
        ComplexNumber cm2 = new ComplexNumber(8, -7);

        System.out.println(cm1);
        System.out.println(cm2);

        System.out.println(cm1.sum(cm2));
        System.out.println(cm1.subtract(cm2));
        System.out.println(cm1.multiplication(cm2));
        System.out.println(cm1.division(cm2));
    }
}

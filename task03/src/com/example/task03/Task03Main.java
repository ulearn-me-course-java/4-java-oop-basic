package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(-1, 1);

        ComplexNumber add = num1.add(num2);
        ComplexNumber mult = num1.multiply(num2);

        System.out.println(add.toString());
        System.out.println(mult.toString());
    }
}

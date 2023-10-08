package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(-2, 5);
        ComplexNumber number2 = new ComplexNumber(3, -4);

        System.out.println(number1.getSum(number2).toString());
        System.out.println(number1.getProduct(number2).toString());
    }
}

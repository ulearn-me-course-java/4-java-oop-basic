package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(-3, 2);
        ComplexNumber secondNumber = new ComplexNumber(5, -6);
        System.out.println(firstNumber.add(secondNumber).toString());
        System.out.println(firstNumber.mul(secondNumber).toString());
    }
}

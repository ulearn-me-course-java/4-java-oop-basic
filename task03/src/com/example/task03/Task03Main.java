package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(2, 3);
        ComplexNumber SecondNumber = new ComplexNumber(1, 4);

        ComplexNumber sum = firstNumber.add(SecondNumber);
        System.out.println(sum);

        ComplexNumber multiply = firstNumber.multiply(SecondNumber);
        System.out.println(multiply);
    }
}

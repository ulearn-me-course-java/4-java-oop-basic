package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(1, -1);
        ComplexNumber secondNumber = new ComplexNumber(3, 6);
        System.out.println(firstNumber.toString());
        System.out.println(secondNumber.toString());
        System.out.println(ComplexNumber.foldComplexNumbers(firstNumber, secondNumber).toString());
        System.out.println(ComplexNumber.multiplyComplexNumbers(firstNumber, secondNumber).toString());
    }
}

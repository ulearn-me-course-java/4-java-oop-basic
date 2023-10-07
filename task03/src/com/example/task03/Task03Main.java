package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 4);
        ComplexNumber number2 = new ComplexNumber(3, 5);
        ComplexNumber resultAdd = number1.add(number2);
        ComplexNumber resultMul = number1.multiply(number2);

        System.out.println("Сложение:");
        System.out.println(resultAdd.toString());
        System.out.println("Умножение:");
        System.out.println(resultMul.toString());
    }
}

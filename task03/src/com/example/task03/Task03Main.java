package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number = new ComplexNumber(22, 2);
        ComplexNumber number1 = new ComplexNumber(22, 2);
        ComplexNumber sum = number.Sum(number1);
        ComplexNumber multip = number.multiplay(number1);
        System.out.println("Сумма: " + sum.toString());
        System.out.println("Произведение: " + multip.toString());

    }
}

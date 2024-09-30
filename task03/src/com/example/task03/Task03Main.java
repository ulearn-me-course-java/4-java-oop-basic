package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumber(4.0, -5.0);

        ComplexNumber sum = num1.add(num2);
        System.out.println("Сумма: " + sum);

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Произведение: " + product);
    }
}

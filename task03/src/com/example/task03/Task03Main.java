package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1.0, 2.0); // 1 + 2i
        ComplexNumber num2 = new ComplexNumber(3.0, 4.0); // 3 + 4i

        ComplexNumber sum = num1.add(num2);
        ComplexNumber product = num1.multiply(num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex number = new Complex(1, -1);
        Complex number1 = new Complex(3, 6);

        Complex sum = number.add(number1);
        Complex product = number.multiply(number1);

        System.out.printf("sum: %s\nproduct: %s", sum.toString(), product.toString());
    }
}

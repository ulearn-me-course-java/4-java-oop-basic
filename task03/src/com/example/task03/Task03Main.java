package com.example.task03;

public class Task03Main {

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(12, 4);
        ComplexNumber num2 = new ComplexNumber(20, -5);
        ComplexNumber sum = num1.add(num2);

        System.out.println(sum.ToString());

        ComplexNumber mul = num1.multiply(num2);

        System.out.println(mul.ToString());
    }
}

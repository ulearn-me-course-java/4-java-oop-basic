package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(10, 1);
        ComplexNumber num2 = new ComplexNumber(-8, 2);
        System.out.println(num1 + "+" + num2 + " = " + ComplexNumber.GetSum(num1, num2));
        System.out.println(num1 + "*" + num2 + " = " + ComplexNumber.GetMultiplicationProduct(num1, num2));
    }
}

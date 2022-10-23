package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, -1);
        ComplexNumber num2 = new ComplexNumber(3, 6);

        ComplexNumber resNum1 = num1.add(num2);
        ComplexNumber resNum2 = num1.multiply(num2);

        System.out.println(resNum1);
        System.out.println(resNum2);
    }
}

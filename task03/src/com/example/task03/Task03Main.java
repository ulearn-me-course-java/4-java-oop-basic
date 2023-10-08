package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(2.0, 3.0);
        ComplexNum num2 = new ComplexNum(1.0, 2.0);

        ComplexNum sum = num1.add(num2);
        ComplexNum product = num1.multiply(num2);

        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

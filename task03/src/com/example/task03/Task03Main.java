package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNum num1 = new ComplexNum(1,2);
        ComplexNum num2 = new ComplexNum(3,4);
        ComplexNum addition = num1.add(num2);
        ComplexNum multiplication = num1.multiply(num2);
        System.out.println(addition.toString());
        System.out.println(multiplication.toString());
    }
}

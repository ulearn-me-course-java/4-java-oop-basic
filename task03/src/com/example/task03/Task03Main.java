package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNum num1 = new ComplexNum(4, 6);
        ComplexNum num2 = new ComplexNum(8, -3);

        ComplexNum sum = ComplexNum.sum(num1, num2);
        ComplexNum multiplication = ComplexNum.multiplication(num1, num2);

        System.out.println("sum: " + sum.toString());
        System.out.println("multiplication: " + multiplication.toString());


    }
}

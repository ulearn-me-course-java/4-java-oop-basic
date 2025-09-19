package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(10,12);
        ComplexNum num2 = new ComplexNum(2,-4);
        System.out.println(num1.Multiply(num2));
        System.out.println(num1.Add(num2));
    }
}

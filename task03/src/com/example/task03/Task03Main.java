package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(1,3);
        ComplexNum num2 = new ComplexNum(10,20);

        System.out.println(num1.sumOfComplexNum(num2).output());
        System.out.println(num1.multiplyOfComplexNum(num2).output());

    }
}

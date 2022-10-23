package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(48.14, 13.44);
        ComplexNum num2 = new ComplexNum(8.19, 4.87);
        System.out.println(num1);
        ComplexNum num3 = num2.multiply(num1);
        System.out.println(num3.toString());
    }
}

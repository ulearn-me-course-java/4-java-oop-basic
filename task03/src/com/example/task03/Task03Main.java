package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex num1 = new Complex(2,3);
        Complex num2 = new Complex(5,-7);
        System.out.println((num1.add(num2)).tostring());
        System.out.println((num1.multiply(num2)).tostring());
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex num1 = new Complex(25,25);
        Complex num2 = new Complex(10,10);
        Complex num3 = new Complex(20);
        System.out.println(num1.add(num2).toString());
        System.out.println(num1.sub(num2).toString());
        System.out.println(num1.mul(num2).toString());
        System.out.println(num3.toString());
    }
}

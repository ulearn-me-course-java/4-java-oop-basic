package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex number1 = new Complex(2,1);
        Complex number2 = new Complex(3,4);
        Complex result1 = number1.add(number2);
        Complex result2 = number1.mult(number2);
        System.out.println(result1.getReal());
        System.out.println(result1.getImage());
        System.out.println(result2.getReal());
        System.out.println(result2.getImage());
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex firtsNumber = new Complex(1, -1);
        Complex secondNumber = new Complex(3,6);

        Complex sum = firtsNumber.sum(secondNumber);
        Complex mul = firtsNumber.mul(secondNumber);
    }
}

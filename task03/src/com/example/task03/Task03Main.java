package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex numOne = new Complex(2, 3);
        Complex numTwo = new Complex(2, 1.5f);

        Complex sum = numOne.add(numTwo);
        Complex product = numOne.multiply(numTwo);

        System.out.println(sum);
        System.out.println(product);
    }
}

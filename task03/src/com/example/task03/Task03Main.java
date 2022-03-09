package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 10);
        Complex c2 = new Complex(7, 5);

        Complex sum = c1.sum(c2);
        Complex dif = c1.difference(c2);
        Complex prod = c1.product(c2);
        Complex quot = c1.quotient(c2);

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(prod);
        System.out.println(quot);
    }
}

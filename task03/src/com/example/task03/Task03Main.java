package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 5);
        Complex c2 = new Complex(1, 3);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        Complex c3 = c1.sum(c2);
        System.out.println("c1 + c2 = " + c3.toString());

        Complex c4 = c1.multi(c2);
        System.out.println("c1 * c2 = " + c4.toString());

    }
}

package com.example.task03;

public class Task03Main
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(10.5, -2);
        Complex c2 = new Complex(5, 1.8);
        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 * c2 = " + c1.multiply(c2));
        System.out.printf("c1: %s \nc2: %s%n", c1, c2);
    }
}

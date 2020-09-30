package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,1);
        Complex c2 = new Complex(5,-2);
        Complex sum = c1.add(c2);
        System.out.println(sum.toString());
        Complex sub = c1.sub(c2);
        System.out.println(sub.toString());
        Complex mult = c1.mult(c2);
        System.out.println(mult.toString());
    }
}

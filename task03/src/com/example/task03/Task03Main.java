package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        Complex a = new Complex(3, 4);
        System.out.println(a.toString());
        Complex b = new Complex(4, 5);
        a = a.add(b);
        System.out.println(a.toString());
        a = a.sub(b);
        System.out.println(a.toString());
        a = a.mul(2);
        System.out.println(a.toString());
        a = a.mul(b);
        System.out.println(a.toString());
        a = a.div(b);
        System.out.println(a.toString());
        a = a.div(2);
        System.out.println(a.toString());
        System.out.println(a.equal(b));
    }
}

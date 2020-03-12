package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(-2, 4);
        Complex b = new Complex(9 , -6);

        System.out.println(a.plus(b).tostring());
        System.out.println(a.multiply(b).tostring());
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        Complex com1 = new Complex(1, 3);
        Complex com2 = new Complex(2, -2);

        Complex com3 = com1.add(com2);
        Complex com4 = com1.multiply(com2);

        System.out.println(com3.toString());
        System.out.println(com4.toString());
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumb c1 = new ComplexNumb(12, 0);
        ComplexNumb c2 = new ComplexNumb(42, 2);
        ComplexNumb c3 = new ComplexNumb(15, 3);
        ComplexNumb c4 = new ComplexNumb(32, 0);

        System.out.println(c1.mlt(c2).toString());
        System.out.println(c1.add(c2).toString());
        System.out.println(c2.mlt(c3).toString());
        System.out.println(c4.mlt(c1).toString());

    }
}

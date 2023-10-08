package com.example.task03;

import static com.example.task03.Complex.multiple;
import static com.example.task03.Complex.sum;

public class Task03Main {
    public static void main(String[] args) {
        Complex complexN1 = new Complex(1.0, 2.3);
        Complex complexN2 = new Complex(-5.4, -6.8);
        //System.out.println(complexN2.toString());
        System.out.println(sum(complexN1, complexN2).toString());
        System.out.println(multiple(complexN1, complexN2).toString());
    }
}

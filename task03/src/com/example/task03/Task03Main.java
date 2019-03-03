package com.example.task03;

import static java.lang.System.out;

import static java.lang.Double.NaN;

public class Task03Main {
    public static void main(String[] args) {
        Complex firstValue = new Complex(Double.MAX_VALUE / 2, Double.MAX_VALUE / 2);
        Complex secondValue = new Complex(NaN, 3.5);
        out.println(firstValue.add(secondValue));
        out.println(firstValue.multiply(secondValue));
    }
}

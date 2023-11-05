package com.example.task03;

import java.util.Collection;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(2, 5);
        ComplexNumber cn2 = new ComplexNumber(3, 2);
        ComplexNumber sum = cn1.sum(cn2);
        ComplexNumber multiply = cn1.multiply(cn2);
    }
}

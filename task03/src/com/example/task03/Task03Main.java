package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(6, 9);
        ComplexNumber cn2 = new ComplexNumber(4.1, 7.9);
        ComplexNumber sum = ComplexNumber.sum(cn1, cn2);
        ComplexNumber mult = ComplexNumber.mult(cn1, cn2);
        System.out.println("SUM: " + sum.getRe() + " + " + sum.getIm() + "i");
        System.out.println("MULT: " + mult.getRe() + " * " + mult.getIm() + "i");
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(5,2);
        ComplexNumber z2 = new ComplexNumber(3,1);
        ComplexNumber z3 = new ComplexNumber(0,-5);
        System.out.println(ComplexNumber.add(z1,z2).toString()); //correct
        z3.print();
    }
}

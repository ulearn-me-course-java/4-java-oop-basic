package com.example.task03;

import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input complex numbers:\nReal Number: ");
        int r1 = in.nextInt();
        System.out.println("Imaginary Number: ");
        int i1 = in.nextInt();

        System.out.println("\nReal Number: ");
        int r2 = in.nextInt();
        System.out.println("Imaginary Number: ");
        int i2 = in.nextInt();

        ComplexNumber first = new ComplexNumber(r1,i1);
        ComplexNumber second = new ComplexNumber(r2,i2);

        System.out.println(first.add(second).to_String());
        System.out.println(first.sub(second).to_String());

    }
}

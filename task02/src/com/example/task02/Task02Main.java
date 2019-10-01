package com.example.task02;

import java.util.Arrays;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts1 = new TimeSpan(2, 35, 5);
        System.out.println("a:\n" + ts1.toString());
        TimeSpan ts2 = new TimeSpan(5, 25, 56);
        System.out.println("b:\n" + ts2.toString());
        ts1.add(ts2);
        System.out.println("Sum a + b:\n" + ts1.toString());
        ts1.subtract(ts2);
        ts1.subtract(ts2);
        System.out.println("Sum a - b:\n" + ts1.toString());
        ts1.setHours(1);
        System.out.println("a:\n" + ts1.toString());
        TimeSpan ts3 = new TimeSpan(0, 59, 56);
        System.out.println("c:\n" + ts3.toString());
        ts1.subtract(ts3);
        System.out.println("Sub a - c:\n" + ts1.toString());
    }
}

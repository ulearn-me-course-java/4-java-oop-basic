package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan first = new TimeSpan(5, 1, 0);
        TimeSpan second = new TimeSpan(0, 5, 5);
        System.out.println(first);
        System.out.println(second);
        first.subtract(second);
        System.out.println(first);

    }
}

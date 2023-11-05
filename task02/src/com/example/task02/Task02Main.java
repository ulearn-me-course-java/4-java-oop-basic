package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan a = new TimeSpan(30, 30, 1);
        TimeSpan b = new TimeSpan(40, 29, 0);
        a.subtract(b);
        System.out.println(a);
    }
}

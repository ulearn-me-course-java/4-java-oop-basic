package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan first = new TimeSpan(1,1,1);
        TimeSpan second = new TimeSpan(2,2,2);
        first.add(second);
        System.out.println(first.toString());
        first.subtract(second);
        System.out.println(first.toString());
    }
}


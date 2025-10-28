package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan test = new TimeSpan(0, 100, 0);

        test.subtract(new TimeSpan(2, 0, 0));

        System.out.println(test.toString());
    }
}

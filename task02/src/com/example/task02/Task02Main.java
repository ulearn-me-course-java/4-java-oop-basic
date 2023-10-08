package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan span = new TimeSpan(3, 140, 90);
        span.add(new TimeSpan(3, 2, 30));
        System.out.println(span);
        Tests tests = new Tests();
        tests.testConstructor();
        tests.testFields();
        tests.testAddMethod();
        tests.testToString();
        tests.testSubtractMethod();
    }
}

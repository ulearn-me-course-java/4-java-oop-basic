package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(3, 40, 54);
        System.out.println(timeSpan1);
        TimeSpan timeSpan2 = new TimeSpan(0, 100, 3700);
        System.out.println(timeSpan2);
        timeSpan1.add(timeSpan2);
        System.out.println(timeSpan1);
    }
}

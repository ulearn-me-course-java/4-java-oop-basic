package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(15, 32, 45691);
        TimeSpan timeSpan = new TimeSpan(25, -96, 12);

        System.out.println(timeSpan);
        System.out.println(timeSpan1);
        timeSpan.add(timeSpan1);
        System.out.println("add: " + timeSpan);
        timeSpan.subtract(timeSpan1);
        System.out.println("subtract: " + timeSpan);
    }
}

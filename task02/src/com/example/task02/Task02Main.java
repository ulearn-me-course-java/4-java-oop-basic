package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(6, 15, 35);
        TimeSpan timeSpan1 = new TimeSpan(6, 46, 26);

        timeSpan.add(timeSpan1);
        timeSpan1.subtract(timeSpan);

        System.out.println(timeSpan.toString());
        System.out.println(timeSpan1.toString());
    }
}

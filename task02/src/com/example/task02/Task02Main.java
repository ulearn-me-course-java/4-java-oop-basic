package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(10, 2, 1);
        System.out.println(time);
        time.add(new TimeSpan(125, 0, 0));
        System.out.println(time);
    }
}

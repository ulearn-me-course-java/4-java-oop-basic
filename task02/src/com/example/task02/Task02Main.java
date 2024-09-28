package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(0, 0, 1);
        System.out.println(time);

        time.subtract(new TimeSpan(125, 0, 0));
        System.out.println(time);
    }
}

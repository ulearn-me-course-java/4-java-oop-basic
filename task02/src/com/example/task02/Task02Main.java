package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(10, 16, 0);
        TimeSpan time2 = new TimeSpan(1, 0, 0);

        time.subtract(time2);
        System.out.println(time.toString());
    }
}

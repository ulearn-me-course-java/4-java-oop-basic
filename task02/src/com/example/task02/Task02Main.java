package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(0, 10, 44);
        TimeSpan time1 = new TimeSpan(0, 2, 3);
        time.subtract(time1);
        System.out.println(time);

    }
}

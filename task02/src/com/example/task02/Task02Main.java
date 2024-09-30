package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(1, 40, 90);
        TimeSpan t2 = new TimeSpan(0, 30, 45);

        System.out.println("Время 1: " + t1);
        System.out.println("Время 2: " + t2);

        t1.add(t2);
        System.out.println(t1);

        t1.subtract(t2);
        System.out.println(t1);
    }
}

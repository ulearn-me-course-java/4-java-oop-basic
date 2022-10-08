package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(10, 45, 3);
        TimeSpan t2 = new TimeSpan(6, 112, 60);

        System.out.println("TimeSpan 1:");
        System.out.println(t1);
        System.out.println(t2);
        t2.add(t1);
        System.out.println(t2);
        t2.subtract(t1);
        System.out.println(t2);
    }
}

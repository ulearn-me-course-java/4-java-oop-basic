package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(5, 5, 5);
        TimeSpan t2 = new TimeSpan(3, 3, 3);

        t1.add(t2);
        System.out.println(t1);

        t1.subtract(t2);
        System.out.println(t1);
    }
}

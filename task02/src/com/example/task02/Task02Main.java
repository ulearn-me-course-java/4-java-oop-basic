package com.example.task02;

public class Task02Main {
    public static void main(String[] args) throws Exception {
        //example
        TimeSpan t = new TimeSpan(2, 34, 12);
        TimeSpan t2 = new TimeSpan(1, 54, 23);
        t.subtract(t2);
        System.out.println(t.toString());
    }
}

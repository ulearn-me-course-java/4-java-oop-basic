package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan firsTime = new TimeSpan(2, 67, 4);
        TimeSpan secondTime = new TimeSpan(3, 33, 2);
        firsTime.add(secondTime);
        System.out.println(firsTime.toString());
    }
}

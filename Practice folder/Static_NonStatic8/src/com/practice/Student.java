package com.practice;

public class Student {
    private int rollNo;
    private String name;
    private static int cnt=0;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        cnt++;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public static int getCnt() {
        return cnt;
    }

//    public void print()
//    {
//        System.out.println(cnt++);
//        System.out.println(Student.getCnt());
//    }
}

package com.practice;

public class ExtendingThread extends Thread {
    public void run()
    {
        int a=10;
        int b=20;
        int result=a+b;

        System.out.println(result);
    }

    public static void main(String[] args) {
        ExtendingThread t1=new ExtendingThread();
        t1.start();
    }
}

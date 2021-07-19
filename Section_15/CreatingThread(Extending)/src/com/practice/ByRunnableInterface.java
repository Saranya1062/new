package com.practice;

public class ByRunnableInterface implements Runnable {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ByRunnableInterface m1 = new ByRunnableInterface();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}

package com.practice;

public class Main {
    public static void main(String[] args) {
        try
        {
            int data=100/0;
        }catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("unchecked exception");
    }
}

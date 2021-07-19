package com.practice;

public class Example {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("unchecked exception");
    }
}

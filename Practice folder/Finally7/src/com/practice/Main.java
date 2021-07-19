package com.practice;

public class Main {

    public static void main(String[] args) {

        int arr[]=new int[2];
        try
        {
            System.out.println("arr[4]="+arr[4]);
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
        finally {
            arr[1]=25;
            System.out.println("arr[1]="+arr[1]);
        }
        System.out.println("This is an example program for finally block");
    }
}

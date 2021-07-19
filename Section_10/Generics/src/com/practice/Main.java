package com.practice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
 //     numbers.add("sss");
        numbers.add(4);
        numbers.add(5);

        printDoubled(numbers);
    }

   public static void printDoubled(ArrayList<Integer> n)
   {
       for(int i:n)
       {
           System.out.println(i*2);
       }
   }
}

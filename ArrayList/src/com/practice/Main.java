package com.practice;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> Fruits=new ArrayList<>();
        Fruits.add("Mango");
        Fruits.add("Apple");
        Fruits.add("Grapes");
        Fruits.add("Orange");
        Fruits.set(3,"Strawberry"); //modify
        System.out.println(Fruits.get(0));
        System.out.println(Fruits);

        Collections.sort(Fruits);
       // System.out.println(Fruits);
        for(String i:Fruits)
        {
            System.out.println(i);
        }
    }
}

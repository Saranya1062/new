package com.practice;

import java.util.HashMap;

public class Persons {

    public static void main(String[] args) {

        HashMap<String, String> person = new HashMap<>();
        person.put("Monday", "XXX");
        person.put("Tuesday","YYY");


        System.out.println("Day:" + person.get("day"));
        System.out.println("Name:" + person.get("name"));
    }
}


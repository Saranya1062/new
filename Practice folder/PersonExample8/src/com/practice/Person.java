package com.practice;

public class Person {
    private String day;
    private String name;
    private String location;

    public Person(String day, String name, String location) {
        this.day = day;
        this.name = name;
        this.location = location;
    }

    public String getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

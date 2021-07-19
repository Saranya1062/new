package com.practice;

public class Rectangle extends Shape{

    public Rectangle(String color, int height, int width) {
        super(color, height, width);
    }

    @Override
    public String msg() {
        return "This is rectangle shape box";
    }
}

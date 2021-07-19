package com.practice;

public class Square extends Shape{

    public Square(String color, int height, int width) {
        super(color, height, width);
    }

    @Override
    public String msg() {
        return "This is square shape box";
    }
}

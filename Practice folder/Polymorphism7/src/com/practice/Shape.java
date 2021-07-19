package com.practice;

public class Shape {

    private String color;
    private int height;
    private int width;

    public Shape(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String msg()
    {
        return "This is Shape of box";
    }
}

package com.practice;

public class Main {

    public static void main(String[] args) {

        Shape shape=new Shape("grey",12,12);
        System.out.println(shape.msg());

        Square s1=new Square("black",10,10);
        System.out.println(s1.msg());

        Rectangle c1=new Rectangle("grey",8,4);
        System.out.println(c1.msg());
    }
}

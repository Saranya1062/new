package com.practice;

public class Student extends Throwable{
    public static void main(String[] args) {

        Person a[]=new Person[4];
        a[0]=new Person("aaa",1);
        a[1]=new Person("bbb",2);
        a[2]=new Person("ccc",3);
        a[3]=new Person("ddd",4);

        try{
            a[0].msg();
            a[1].msg();
            a[2].msg();
            a[3].msg();
            a[4].msg();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array not found");
        }
    }
}

class Person{
    private String name;
    private int rollNo;

    public Person(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void msg()
    {
        System.out.println(name+","+rollNo);
    }
}

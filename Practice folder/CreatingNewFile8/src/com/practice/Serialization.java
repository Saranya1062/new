package com.practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
    String name;
    int rollNo;
    String contact;

    public Serialization(String name, int rollNo, String contact) {
        this.name = name;
        this.rollNo = rollNo;
        this.contact = contact;
    }
}

    class Demo {
        public static void main(String[] args) {
            try {
                Serialization s = new Serialization("AAA", 10, "111111");
                FileOutputStream f1 = new FileOutputStream("C:\\Users\\91737\\Desktop\\SampleFile.txt");
                ObjectOutputStream obj = new ObjectOutputStream(f1);
                obj.writeObject(s);
                obj.flush();
                obj.close();
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
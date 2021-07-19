package com.practice;

import java.io.*;

public class Call {

    public static void main(String[] args) throws Exception {
        Mobile obj=new Mobile();
        obj.brand="RedMi";
        obj.OS="Android";

        FileOutputStream fo=new FileOutputStream("C:\\Users\\91737\\Desktop\\SampleFile.txt");
        ObjectOutputStream file1=new ObjectOutputStream(fo);
        file1.writeObject(obj);
        file1.close();

        FileInputStream fi=new FileInputStream("C:\\Users\\91737\\Desktop\\SampleFile.txt");
        ObjectInputStream file2=new ObjectInputStream(fi);
        Mobile obj1=(Mobile)file2.readObject();
        file2.close();
        System.out.println(obj1.brand);
        System.out.println(obj1.OS);
    }
}

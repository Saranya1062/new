package com.practice;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter f1 = new FileWriter("C:\\Users\\91737\\Desktop\\SampleFile.txt");
            f1.write("Java is an object oriented programming language!!");
            f1.close();
                System.out.println("Successfully written");
            } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

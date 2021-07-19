package com.practice;

import java.io.File;
import java.io.IOException;

public class CreatingNewFile {

    public static void main(String[] args) throws IOException {
        try {
            File f1 = new File("C:\\Users\\91737\\Desktop\\SampleFile.txt");
            if (f1.exists()) {
                System.out.println("File name: " + f1.getName());
            } else {
                System.out.println("File not found");
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {

        try {
            File file=new File("C:\\Company\\Java\\Practice folder\\CheckedException7\\Sample.txt");
            FileInputStream f1=new FileInputStream(file);
            System.out.println("File is Founded");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

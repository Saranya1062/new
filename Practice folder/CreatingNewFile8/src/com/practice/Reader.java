package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream f1 = new FileInputStream("C:\\Users\\91737\\Desktop\\SampleFile.txt");
            int i=0;
            while((i=f1.read())!=-1)
            {
                System.out.print((char)i);
            }
            f1.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

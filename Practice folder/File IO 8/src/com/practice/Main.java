package com.practice;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\91737\\Desktop\\SampleFile.txt");
        Writer();
        Reader();
    }

    public static void Writer() throws IOException {
        FileWriter file1 = new FileWriter("C:\\Users\\91737\\Desktop\\SampleFile.txt");
        BufferedWriter b = new BufferedWriter(file1);
        b.write("This method is for buffered writer..");
        b.close();
        System.out.println("Wrote");
    }

    public static void Reader() throws IOException {
        try {
            FileReader file2=new FileReader("C:\\Users\\91737\\Desktop\\SampleFile.txt");
            BufferedReader b=new BufferedReader(file2);
            int i=0;
            while((i=b.read())!=-1)
            {
                System.out.print(i);
            }
            b.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

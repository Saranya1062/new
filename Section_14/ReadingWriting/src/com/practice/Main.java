package com.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
          //  FileInputStream file = new FileInputStream("data.txt");
            //FileChannel channel = file.getChannel();
            Path dataPath = Paths.get("data.txt");
            Files.write(dataPath, "\nAdd something".getBytes("UTF-8"), StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(dataPath);
            for(String line : lines) {
                System.out.println(line);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
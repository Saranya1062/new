package com.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        if(args.length>0) {
            String s1 = args[0];
            String s2 = args[1];
            String s3 = args[0] + " " + args[1];
        }

        List<String> list = new ArrayList<>();
        BufferedReader f1 = new BufferedReader(new FileReader("C:\\Company\\Java\\Practice folder\\Logincredentials\\LoginDetails.txt"));

        String s;
        while ((s=f1.readLine())!= null) {
            list.add(s);
        }

        for(int i=0;i<list.size();i++)
        {
            if(list.contains(s3))
            {
                System.out.println("Valid login");
            }
            else{
                System.out.println("Invalid login");
            }
        }
    }
}

//    Diya  Welcome10
//    Madhu New@13
//        Dhivya Moon25
//        Rupa Password@07
//        Vino 3World#
//        Kani Star$75
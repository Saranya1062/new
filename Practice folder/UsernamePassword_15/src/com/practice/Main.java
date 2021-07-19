package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loginDetails();
    }

    private static void loginDetails() {
        Scanner sc=new Scanner(System.in);

        String username=sc.next();
        System.out.println("Enter your username");

        String password=sc.next();
        System.out.println("Enter your password");

        File f1=new File("C:\\Company\\Java\\Practice folder\\UsernamePassword_15\\LoginDetails.txt");

        try{
            Scanner read=new Scanner(f1);

            while(read.hasNextLine()){
               username=read.next();
               password=read.next();
               read.next();

               String s1[]=read.delimiter().split("");
               if((s1[0].equals(username)) && (s1[1].equals(password)))
               {
                   System.out.println("Valid login");
                   break;
               } else {
                   System.out.println("Invalid login");
               }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

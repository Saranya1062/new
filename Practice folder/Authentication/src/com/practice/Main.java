package com.practice;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       boolean output= loginDetails();
       if(output){
           System.out.println("Valid login");
       }else {
           System.out.println("Invalid login");
       }
    }

    private static boolean loginDetails() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username:");
        String username=sc.nextLine();
        System.out.println("Enter your password:");
        String password=sc.nextLine();

        String f1="C:\\Company\\Java\\Practice folder\\Authentication\\Details.txt";

        boolean login=false;
        String tempUsername="";
        String tempPassword="";

        try{
            Scanner read = new Scanner(new File(f1));
           // read.useDelimiter("[,\n]");

            while(read.hasNext()) {
                read.useDelimiter("[,\n]");
                tempUsername = read.next();
                tempPassword = read.next();

                if (tempUsername.trim().equals(username) && tempPassword.trim().equals(password)) {
                    login = true;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        return login;
    }
}

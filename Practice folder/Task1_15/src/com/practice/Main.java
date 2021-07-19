package com.practice;

import java.util.Scanner;

public class Main {
    private static Scanner read;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        System.out.println("Enter your username");
        String password=sc.next();
        System.out.println("Enter your password");
        String file="C:\\Company\\Java\\Practice folder\\Task1_15\\Logindetails.txt";

        loginDetails(username,password,file);
    }

    private static void loginDetails(String username,String password,String file) {

        boolean login = false;
        String tempUsername="";
        String tempPassword="";

        try{
            read=new Scanner(file);
            read.useDelimiter("[,\n]");

            while(read.hasNext()){
                tempUsername=read.next();
                tempPassword=read.next();

                if(tempUsername.equals(username) && tempPassword.equals(password)) {
                    login=true;
                    System.out.println("Valid login");
                }
                else {
                    System.out.println("Invalid login");
                }
            }
            read.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

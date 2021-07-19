package com.practice;

import java.util.Scanner;

public class AgeEligibilityException extends Exception{

    public AgeEligibilityException(String s)
    {
        super(s);
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try
        {
            if(age>=30)
            {
                System.out.println("Eligible");
            } else{
                throw new AgeEligibilityException("Age less than 30");
            }
        }
        catch (AgeEligibilityException e)
        {
            System.out.println("we have a problem: "+ e.getMessage());
            //e.printStackTrace();
          //throw new AgeEligibilityException("abc");
            //throw e;
        }
    }
}

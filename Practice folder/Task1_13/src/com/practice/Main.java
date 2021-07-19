package com.practice;


public class Main {

    public static void main(String[] args) {
        String input="Hello World";
        byte[] arr=input.getBytes();
        System.out.println(arr.toString());

        char c='o';
        int output=c;                               //type casting

        StringBuffer b=new StringBuffer();
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=output)
            {
                char c1=(char)arr[i];
                b.append(c1);
            }
        }
        System.out.println(b.toString());

//        char cr='o';
//
//        for(int i=0;i<input.length();i++) {
//            if (arr[i] == c) {
//               input.replaceAll(c, "");
//            }
//        }



//        String s=arr.toString();
//        s=s.replaceAll("o","");
//        s.getBytes();
//
//         System.out.println(s);

    }
}

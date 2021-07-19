package com.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunCode {
   public static List<String> list=new ArrayList<>();
    public static Person preparePersonRecord(String name, String date, String loc)
    {
        Person p=new Person(name);
        DOB d=new DOB(date,loc);
        p.setDob(d);
        return p;
    }

    public static void createPersonCollection(String name, String date, String loc){
        Person p1=preparePersonRecord(name,date,loc);
        list.add(p1.getName()+" "+p1.getDob().getDate()+" "+p1.getDob().getLocation());
    }

    public static void printPersonRecords(List<String> list){
        for(int i=0;i< list.size();i++)
            System.out.println(list.get(i));
    }

    public static void storePersonObjects(List<String> list) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\91737\\Desktop\\SampleFile.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        for(int i=0;i<list.size();i++){
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
    }

    public static void main(String args[]) throws Exception{
        createPersonCollection("xxx","10/04/2021","Chennai");
        createPersonCollection("yyy","13/12/2021","Madurai");
        createPersonCollection("zzz","05/05 /2021","Salem");
        printPersonRecords(list);
        storePersonObjects(list);
       // System.out.println(list);
        for(int i=0;i< list.size();i++){
            String[] ar=list.get(i).split(" ");
            String name=ar[0];
            if (name.equals("xxx")) {
                System.out.println(ar[1] + " " + ar[2]);
                break;
            }
        }
    }
}

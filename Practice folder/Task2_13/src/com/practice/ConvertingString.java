package com.practice;

import java.io.*;

public class ConvertingString {

    public static void main(String[] args) {
        replaceString("Content.txt","Modified.txt","Chennai","Madras");
    }

    public static void replaceString(String location1,String location2,String oldString, String newString) {
        File f1 = new File(location1);
        FileReader read;
        BufferedReader br=null;

        File f2=new File(location2);
        FileWriter write;
        BufferedWriter bw=null;
        try {
//            File f1 = new File(location1);
//            FileReader read=new FileReader(f1);
//            BufferedReader br=new BufferedReader(read);

            read=new FileReader(f1);
            br=new BufferedReader(read);
            String oldWord="";
            String text = br.readLine();

            while(text!=null) {
              oldWord = oldWord + text+"\n";
              text=br.readLine();
            }

            String newWord = oldWord.replaceAll(oldString, newString);

            write=new FileWriter(f2);
            bw=new BufferedWriter(write);

            bw.write(newWord);

//            br.close();
//            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                bw.close();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

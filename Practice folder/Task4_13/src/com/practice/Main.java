package com.practice;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws ParseException {

        createDetails("aaa", "sales", "05-02-2001", "Y", "Y");
        createDetails("bbb", "sales", "03-04-2000", "N", "Y");
        createDetails("ccc", "sales", "05-02-1999", "Y", "N");
        createDetails("ddd", "sales", "03-04-2005", "N", "Y");
        createDetails("eee", "sales", "05-02-2004", "Y", "Y");
        printDetails();
        fileDetails();
    }

    private static void createDetails(String name, String dept, String doj, String javaCertification, String bankAccount) {
        Employee e = new Employee(name, dept, doj, javaCertification, bankAccount);
        list.add(e.getName() + " " + e.getDept() + " " + e.getDoj() + " " + e.getJavaCertification() + " " + e.getBankAccount());
    }


    private static void printDetails() throws ParseException {
        Date date1 = new SimpleDateFormat("dd-mm-yyyy").parse("01-01-2002");
        int i1 = 0;
        while (i1 < list.size()-1) {
            String s1 = list.get(i1).toString();
            String[] s2 = s1.split(" ");
            Date date2 = new SimpleDateFormat("dd-mm-yyyy").parse(s2[2]);
            if (date1.after(date2)) {
                System.out.println(date2);
            }

            i1++;
        }
    }


    public static void fileDetails() {
        try {
            File f1=new File("EmployeeDetails.txt");
            FileReader read1=new FileReader(f1);
            BufferedReader file1 = new BufferedReader(read1);
            String s;

            File f2=new File("JavaCertified.txt");
            FileWriter w2=new FileWriter(f2);
            BufferedWriter file2 = new BufferedWriter(w2);

            File f3=new File("JavaNotCertified.txt");
            FileWriter w3=new FileWriter(f3);
            BufferedWriter file3 = new BufferedWriter(w3);

            while ((s = file1.readLine()) != null) {
                String s1[] = s.split(" ");
                if (s1[3].equalsIgnoreCase("y")) {
                    file2.write(s + "\n");
                } else {
                    file3.write(s + "\n");
                }
            }
            file1.close();
            file2.close();
            file3.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}

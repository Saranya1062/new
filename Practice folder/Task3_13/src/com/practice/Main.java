package com.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException{
        displayArrayList();
      //  printDetails();
    }

    public static void displayArrayList() {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("aaa", "sales", "10/04/2002", "Y", "Y"));
        list.add(new Employee("bbb", "purchase", "01/02/2001", "Y", "Y"));

//        for (Employee e : list) {
//            System.out.println(e.getName() + "|" + e.getDept() + "|" + e.getDoj() + "|" + e.getJavaCertification() + "|" + e.getBankAccount());
//        }

        Date date1 = new SimpleDateFormat("dd-mm-yyyy").parse("01-01-2002");
        StringBuilder sb = new StringBuilder();
        int i1 = 0;
        while (i1 < list.size() - 1) {
            String s1 = list.get(i1).toString();
            String[] s2 = s1.split(" ");
            Date date2 = new SimpleDateFormat("dd-mm-yyyy").parse(s2[2]);
            if (date1.after(date2)) {
                System.out.println(date2);
            }
            i1++;
        }
    }
}

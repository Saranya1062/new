package com.practice;

import com.practice.model.DBHelper;
import com.practice.model.Employee;

import java.sql.SQLException;
import java.util.List;

public class Controller {

    public static void main(String[] args) throws SQLException {
        DBHelper dbHelper=new DBHelper();

        System.out.println("Retrieving data's of Dept Employees: ");
        List<Employee> dept=dbHelper.queryDept("Sales");
        for(Employee e:dept) {
            System.out.println("Eno:"+ e.getEno()+" | "+"Ename:"+e.getEname()+" | "+"Age:"+e.getAge()+" | "+"Salary:"+e.getSalary()+" | "+"Deptno:"+e.getEdeptno());
        }

        List<Employee> retire=dbHelper.queryRetire();

        System.out.println("\nRetrieving data's of Retired Employees: ");
        for(Employee r:retire) {
            System.out.println("Eno:"+ r.getEno()+" | "+"Ename:"+r.getEname()+" | "+"Age:"+r.getAge()+" | "+"Salary:"+r.getSalary()+" | "+"Deptno:"+r.getEdeptno());
        }
    }
}

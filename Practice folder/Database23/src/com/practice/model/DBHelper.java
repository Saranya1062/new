package com.practice.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    private static final String DB_NAME="employee.db";

    public static final String CONNECTION_STRING="jdbc:sqlite:C:\\Company\\Practice folder\\Database23\\" + DB_NAME;

    public static final String TABLE_EMP = "Employee";
    public static final String COLUMN_EMP_NO = "eno";
    public static final String COLUMN_EMP_NAME = "ename";
    public static final String COLUMN_EMP_AGE = "age";
    public static final String COLUMN_EMP_SALARY = "salary";
    public static final String COLUMN_EMP_DEPTNO = "edeptno";

    public static final String TABLE_DEPT = "Department";
    public static final String COLUMN_DEPT_NO = "deptno";
    public static final String COLUMN_DEPT_NAME = "deptname";

    public static final String QueryDept="SELECT * FROM Employee "+
            "INNER JOIN Department ON Employee.edeptno = "+
            "Department.deptno "+
            "WHERE Department.deptname=\"";

    public static final String QueryRetire="SELECT * FROM Employee WHERE age>=58";


    public List<Employee> queryDept(String deptname) {

        StringBuilder sb = new StringBuilder(QueryDept);
        sb.append(deptname);
        sb.append("\"");
        try(Connection con=DriverManager.getConnection(CONNECTION_STRING);
            Statement st=con.createStatement();

            ResultSet results=st.executeQuery(sb.toString()))
        {

            List<Employee> Employees= new ArrayList<>();
            while(results.next()) {
                Employee employee=new Employee();
                employee.setEno(results.getString("eno"));
                employee.setEname(results.getString("ename"));
                employee.setAge(results.getString("age"));
                employee.setSalary(results.getString("salary"));
                employee.setEdeptno(results.getString("edeptno"));

                Employees.add(employee);
            }
            return Employees;

        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<Employee> queryRetire() throws SQLException {
        Connection con=DriverManager.getConnection(CONNECTION_STRING);
        Statement st=con.createStatement();
        try {
            ResultSet results=st.executeQuery(QueryRetire);

            List<Employee> Employees= new ArrayList<>();
            while(results.next()) {
                Employee employee=new Employee();
                employee.setEno(results.getString(COLUMN_EMP_NO));
                employee.setEname(results.getString(COLUMN_EMP_NAME));
                employee.setAge(results.getString(COLUMN_EMP_AGE));
                employee.setSalary(results.getString(COLUMN_EMP_SALARY));
                employee.setEdeptno(results.getString(COLUMN_EMP_DEPTNO));

                Employees.add(employee);
            }
            return Employees;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
}

package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Company\\Java\\Section_19\\TestDB\\src\\com\\practice\\testjava.db");
            Statement st=conn.createStatement();
            st.execute("CREATE TABLE contacts(name TEXT, phone INTEGER,email TEXT)");
        } catch(SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}

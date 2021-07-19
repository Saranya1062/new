package com.practice;

public class Employee {
    private String name;
    private String dept;
    private String doj;
    private String javaCertification;
    private String bankAccount;

    public Employee(String name, String dept, String doj, String javaCertification, String bankAccount) {
        this.name = name;
        this.dept = dept;
        this.doj = doj;
        this.javaCertification = javaCertification;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getJavaCertification() {
        return javaCertification;
    }

    public void setJavaCertification(String javaCertification) {
        this.javaCertification = javaCertification;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
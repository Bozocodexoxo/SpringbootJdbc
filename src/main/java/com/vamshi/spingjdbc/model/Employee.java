package com.vamshi.spingjdbc.model;

public class Employee {
    int empid;
    String name;
    String tech;

    public Employee(int empid, String name, String tech) {
        this.empid = empid;
        this.name = name;
        this.tech = tech;
    }

    public Employee() {

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}

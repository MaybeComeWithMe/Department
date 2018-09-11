package com.example.demo.model;

import java.util.Date;

public class EmployeeInfo{
    private int id;
    private String Full_name;
    private Date DateOfBirthday;
    private int depId;
    private String position;
    private int salary;

    public EmployeeInfo(){

    }

    public EmployeeInfo(int id, String full_name, Date dateOfBirthday, int depId, String position, int salary) {
        this.id = id;
        this.Full_name = full_name;
        this.DateOfBirthday = dateOfBirthday;
        this.depId = depId;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String full_name) {
        this.Full_name = full_name;
    }

    public Date getDateOfBirthday() {
        return DateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.DateOfBirthday = dateOfBirthday;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
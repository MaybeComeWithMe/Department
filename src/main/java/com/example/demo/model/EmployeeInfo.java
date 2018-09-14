package com.example.demo.model;

import java.util.Date;

public class EmployeeInfo {
    private Long id;
    private String fullName;
    private Date dateOfBirthday;
    private String position;
    private String depName;
    private double salary;
    private int depId;


    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public EmployeeInfo() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public EmployeeInfo(Long id, String fullName,  String position, double salary, Date dateOfBirthday,int depId,String depName) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirthday = dateOfBirthday;
        this.position = position;
        this.depName = depName;
        this.depId = depId;
        this.salary = salary;
    }

    public EmployeeInfo(Long id, String fullName, Date dateOfBirthday, String position, double salary, String depName) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirthday = dateOfBirthday;
        this.position = position;
        this.salary = salary;
        this.depName = depName;
    }
}
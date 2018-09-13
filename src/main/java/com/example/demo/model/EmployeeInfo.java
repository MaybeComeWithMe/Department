package com.example.demo.model;

import java.util.Date;

public class EmployeeInfo {
    private Long id;
    private String fullName;
    private Date dateOfBirthday;
    private int depId;
    private String position;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeInfo(Long id, String fullName, String position, double salary, Date dateOfBirthday, int depId) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.dateOfBirthday = dateOfBirthday;
        this.depId = depId;

    }
}
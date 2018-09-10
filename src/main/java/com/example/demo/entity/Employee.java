package com.example.demo.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private long id;

    @Column(name = "Full_name", nullable = false)
    private String Full_name;

    @Column(name = "Position", nullable = false)
    private String position;

    @Column(name = "Salary", nullable = false)
    private int salary;

    @Column(name = "DateOfBirthday", nullable = false)
    private Date DateofBirthday;

    @Column(name = "depId", nullable = false)
    private int depId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
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

    public Date getDateofBirthday() {
        return DateofBirthday;
    }

    public void setDateofBirthday(Date dateofBirthday) {
        DateofBirthday = dateofBirthday;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }
}

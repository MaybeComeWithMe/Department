package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
    private Long id;
    private String Full_name;
    private Date DateOfBirthday;
    private int depId;
    private String position;
    private int salary;

    public Long getId() {
        return id;
    }

    public String getFull_name() {
        return Full_name;
    }

    public Date getDateOfBirthday() {
        return DateOfBirthday;
    }

    public int getDepId() {
        return depId;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public EmployeeNotFoundException(String message, Long id, String full_name, Date dateOfBirthday, int depId, String position, int salary) {
        super(String.format("%s not found with %s : '%s'", id, full_name, dateOfBirthday, depId, position, salary));
        this.id = id;
        this.Full_name = full_name;
        this.DateOfBirthday = dateOfBirthday;
        this.depId = depId;
        this.position = position;
        this.salary = salary;
    }

}
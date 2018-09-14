package com.example.demo.model;

public class DepartmentsInfo {
    private int id;
    private String name;
    private String fullName;
    private Long idEmp;
    private int depId;
    private Long idEmployee;
    private int departmentId;

    public DepartmentsInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DepartmentsInfo(int id, String name, String fullName, Long idEmployee, int departmentId) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.idEmployee = idEmployee;
        this.departmentId = departmentId;
    }
}
